# 第1章-Java多线程技能

标签：Java

---

- 多线程是异步的，Eclipse里代码的顺序不是线程执行的顺序，线程被调用的时机是随机的
- 多线程实现的两种方式
	- 继承Thread类。源码如下
	```
	public class Thread implements Runnable
	```
		- 分析：Thread类实现了Runnable接口，所以自定义线程类要继承Thread，并重写run方法。然后该方式不可以支持多继承，所以可采用另一种方式直接实现Runnable接口（Run1.java）
	- 实现Runnable接口
	```Run3.java
		Runnable runnable01=new MyRunnable01();
        Thread thread=new Thread(runnable01);
        thread.start();
	```
		- 需要借助Thread构造方法，传入Runnable对象。常用Thread构造方法（也可以传入Thread对象）：
		- Thread(Runnable);Thread(Runnable target,String name);Thread(ThreadGroup p,Runnable target,String name);
- 解释start()
	- start()调用线程的start()方法表示通知“线程规划期”此线程已经就绪，让系统安排一个时间来调用Thread中的run()方法，让线程得到运行，启动线程，具有异步执行的效果。如果直接调用线程的run()方法则是同步执行，不交给“线程规划期”来进行处理。因此start()方法的顺序不代表线程启动的顺序（Run2.java）
	- **问题：不知道为什么继承Thread类重写run方法要写super.run()方法/好像有的不用**
- 关于自定义线程类中共享数据/不共享数据的实现情况。（注意在共享数据的情况要对run方法进行synchronized加锁）
```
public class Run4 {

    public static void main(String[] args) {
        
        //不共享数据（实例变量）
        MyThread04 ta = new MyThread04("A");
        MyThread04 tb = new MyThread04("B");
        MyThread04 tc = new MyThread04("C");
        MyThread04 td = new MyThread04("D");
//        ta.start();
//        tb.start();
//        tc.start();
//        td.start();

        //共享数据
        MyThread04 t5=new MyThread04();
        Thread threadA=new Thread(t5,"A");
        Thread threadB=new Thread(t5,"B");
        Thread threadC=new Thread(t5,"C");
        Thread threadD=new Thread(t5,"D");
        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }
}
```
- 常见的方法
	- Thread.currentThread().getName(); 可返回代码段正在被哪个线程调用，注意自定义线程的构造方法通常由main调用
	- mythread.isAlive(); 判断线程是否处于活动状态。注意活动状态指线程已经启动且尚未终止，start()后即算入活动状态
	- Thread.sleep(2000); 自定义线程内run()方法中写入或main中也可，让当前运行的线程sleep，
	- runThread.getId(); 取得线程的为一标识
- 停止线程
	- 有3种方法
		- 1 使用推出标志，使线程正常推出，也就是当run方法完成后线程终止
		- 2 使用stop方法强行终止线程，但是不推荐使用这个方法，因为stop和suspend及resume一样，都是昨非国企的方法，使用它们可能产生不可预料的结果
		- 3 使用interrupt方法中断线程
	- interrupt()方法：仅在当前线程中打一个停止的标记，并不是真正停止线程
		- 判断线程是否中断的方法thread.interrupted()和thread.isInterrupted()，区别在前者执行后将状态标志置清除为false，后者不清除状态标志
	- 停止线程（异常法for+InterruptedException）
		- run中用for方法判断线程是否停止状态跳出
		```Run5.java
		public void run(){
			super.run();
			for(int i=0;i<500000;i++){
				if(this.interrupted()){
					break;
				}
			}
		}
		```
		- 用try catch解决run方法中，for跳出后外for下面语句还可执行. 抛出throw new InterruptedException();捕获完全跳出终止线程
	- sleep()中停止
		- 先sleep()后interrupted()终止：则先执行了sleep()前的代码，interrupted()后抛出InterruptedException()异常终止
		- 先interrupted()再sleep()：则run方法前面代码均执行，直到遇到sleep()后抛出InterruptedException()异常
	- 停止线程（暴力stop停止）
		- stop()方法再JDK中被表明是“作废/过期”的方法，不建议在程序中使用。如使用stop()释放锁会给数据造成不一致性的结果，如加锁操作未完成因stop()释放锁退出，则调用该结果输出为与目标对象或原值不一致的情况
		- 该方法会抛出ThreadDeath异常，但通常该异常不要显示地捕捉Run6.java
	- 停止线程（结合interrupted()和return）
		- 还是建议使用“抛异常”的方法来实现线程的停止，因为在catch块中还可以将异常向上抛，使线程停止的事件得以传播Run7.java
- 暂停线程
	- 可以使用suspend()暂停线程，用resume()方法恢复线程的执行
	- suspend()与resume()的缺点：独占，如果使用不当，极易造成公共的同步对象的独占，是的其他线程无法访问公共同步对象
	- 独占简单举例：线程A先调用C的synchronized方法，在C中suspend被暂停。B此后无法再调用该方法；另一种是A在主方法中被suspend()随后便输入"main end"可以，而当A的run方法中含有print方法时，当suspend()暂停时，print方法带锁不被释放，将不打印"main end"
	- 缺点二：不同步。举例:A对C初始化，中途突然被暂停，初始化未完成。最后返回不同步的结果
- yield方法
	- Thread.yield() 表示CPU会让给其他资源导致速度变慢，而无yield时则表示CPU独占时间片时间
- 线程的优先级
	- 基本概念：从1到10，优先级越高得到的CPU资源较多，也就是CPU优先执行优先级较高的线程对象中的任务，但注意并不是一定先执行高优先级的任务
	- 如果优先级小于1或者大于10，则JDK抛出异常throw new IllegalaRGUMENTeXCEPTION()
	- JDK存在3个常量来预置定义优先级的值
	```
	//thread1.setPriority(1);
	public final static int MIN_PRIORITY=1;
	public final static int NORM_PRIORITY=5;
	public final static int MAX_PRIORITY=10;
	```
	- 优先级有继承特性
- 守护线程
	- Java线程有两种线程，一种时用户线程，另一种是守护线程
	- thread1.setDaemon(true);
	- 特点是只要当前当前实例中存在任何一个非守护线程美哟u结束，守护县城救灾工作，只有当最后以恶搞结束是，守护线程按此随着JVM一同结束工作。最典型的守护线程就是垃圾回收线程，也也就是说守护线程最典型的应用就是GC(垃圾回收器)