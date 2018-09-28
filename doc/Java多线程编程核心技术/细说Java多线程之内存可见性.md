# 细说Java多线程之内存可见性

标签：Java

---

## 多线程基本概念

Java内存模型（JMM）
- 主内存变量和线程变量
	- 所有的变量都存储在主内存中，而每个线程都有自己独立的工作内存，里面保存一个副本（主内存中该变量的一个拷贝）
- 两条规定
	- 线程只能访问自己的副本，不能操作主内存的变量
	- 线程间不可互相访问变量，线程间变量的交互需要通过主内存传递
- 语言实现（主要是synchronized和volative）

---

## synchronized

- synchronized实现原理
	- 两条规定
		- 解锁前，把共享变量的最新值刷新到主内存中
		- 加锁时，清空工作内存中共享变量的值，从而使用共享变量时，必须从主内存中重新读取最新的值
	- 重排序
		- 代码书写顺序与实际执行的顺序不同，指令重排序是编译器或处理器为了提高程序性能而做的优化
	- 单线程/多线程
		- 程序执行的结果与代码书写顺序执行结果相同，重排序不会给单线程带来内存可见性问题。多线程会
	- 例子分析
		- 重点 6可能是重排序得
	- 选择题
		- （错误）当一个线程访问object的一个synchronized(this)同步代码块时，其他线程对object中所有其它synchronized(this)同步代码块的访问不会被阻塞。
		- （正确）当一个线程访问object的一个synchronized(this)同步代码块时，它就获得了这个object的对象锁。结果，其它线程对该object对象所有同步代码部分的访问都被暂时阻塞。

---

## volatile

- volatile实现原理
	- 通过加入内存屏障和禁止重排序优化来实现
		- 对volatile变量执行写操作时，会在写操作后加入一条store屏障指令
		- 对...读操作时，会在读操作前加入一条load品璋指令
	- 实现过程
		- 访问volatile变量时会强制复制主内存的值，volatile变量值发生改变时，更新到主内存中
- volatile不能保证volatile变量相关操作的原子性
	- 如private volatile int num++;
	- 理解：volatile是对变量操作时，会发生从主内存中读取出最新变量；但不是对操作加锁，多个可同时对变量进行操作，同时读取出主内存中的值
	- 解决方法

```
1. volatile 

private volatile int number=0;

public void increase(){
	try{
		Thread.sleep(100);
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	this.number++;
}

2. 2.1 synchronized

private int number=0;

public synchronized void increase(){	//但是由于其中有线程等待的操作，所以加锁在此处容易等待时间比较长
	try{
		Thread.sleep(100);
	}catch(InterruptedException e){
		e.printStackTrace();
	}
		this.number++;	
}

-> 2.2 所以缩小加锁的范围

public void increase(){
	try{
		Thread.sleep(100);
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	synchronized(this){
		this.number++;
	}
}

3. 用ReentrantLock实现

private Lock lock=new ReentrantLock();

public void increase(){
	try{
		Thread.sleep(100);
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	lock.lock();
	try{	//lock此处加锁可能抛出异常，所以try finally保证一定能释放
		this.number++;
	}finally{
		lock.unlock();
	}
}


```