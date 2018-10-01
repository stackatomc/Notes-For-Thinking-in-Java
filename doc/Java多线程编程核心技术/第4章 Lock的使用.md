# 第4章 Lock的使用

标签：Java

---

- 这章主要介绍Java5中Lock对象实现同步，效果比synchronized实现更方便
- 使用ReentrantLock类
	- 重要方法：lock.lock()和lock.unlock()
	- 扩展功能：实现同步互斥、在扩展功能上更加强大，更具有嗅探锁定、多路分支通知等功能，而且在使用上也比Synchronized更加灵活
- 使用Condition实现等待/通知
	- 特点：相当于wait()，对比优势在Condition的await方法可通过直接指定condition对象进行唤醒signal()，避免像notifyAll()时需要通知所有的WAITING线程，没有选择权，会出现相当大的效率问题
	- 实现一个实例，注意Condition必须要结合ReentrantLock类进行实现，Condition.await()或signal()方法都要写在lock.lock()方法后
	- 实例：可以通过创建多个Condition对象，实现指定通知线程对象（因为可以区分调用conditionA.signal()和conditionB.signal()唤醒指定的线程，在不同方法中定义逻辑即可）
- 公平锁与非公平锁
	- 公平锁指线程获取锁的顺序是按照线程加锁的顺序来分配的，即先来先得的FIFO先进先出顺序。而非公平锁就是一种获取锁的抢占机制，是随机获得锁的。
	- 实现方法是可以通过构造方法对ReentrantLock对象附boolean参数，true表示公平锁
	- 默认情况下ReentrantLock类用的是非公平锁
- ReentrantLock类的一些使用方法
	- getHoldCount() 返回当前线程保持此锁定的个数，也就是调用lock.lock()方法的次数（比如锁重入后，次数+1）
	- getQueueLength() 返回正等待获取此锁定的线程估计数，比如一个线程获得lock锁首先执行await()方法，但未释放锁，共5个线程，则该方法返回值为4，表示4个线程正在等待
	- getWaitQueueLength(Condition condition)指返回等待与此锁定相关的给定条件Condition的线程估计数，比如5个线程都执行了同一个condition对象的await方法，则调用了getWaitQueueLength(Condition condition)返回5
	- lock.hasQueuedThread(threadA) boolean返回调用线程是否在等待获取此锁定
	- boolean hasWriters(Condition condition) 
	- isFair()
	- boolean lock.hasQueuedThreads()
	- boolean isHeldByCurrentThread()
	- boolean isLocked()
	- void lockInterruptibly()：如果当前线程未被中断，则获取锁定；如果已经被中断则出现异常，如果是lock.lock()则同步等待获取锁
	- boolean tryLock()只有当调用时没有被另一个线程保持的情况下才获取该锁定
- ReentrantReadWriteLock类
	- 读写锁表示也有两个锁，一个是读操作相关的锁，也称为共享锁；另一个是写操作相关的锁，也叫排他锁
	- 实现方式：都是ReentrantReadWriteLock类，调用不同方法，lock.readLock().lock()读锁；lock.writeLock().lock()写锁