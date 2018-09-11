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