# 第5章 定时器Timer

标签：Java

---

- 定时器Timer的使用
	- JDK库中Timer类主要 负责计划任务的功能，也就是在指定的事件执行某一个任务
	- 实现对象：Timer类的主要作用就是设置计划任务，但封装任务的类却是TimerTask类
	- 注意：
	- 特殊情况：
		- timer.schedule(task,dateRef);执行任务的事件早于当前事件，则立即执行task任务
		- 执行任务的事件万余当前事件，在未来执行。可以把Timer对象附参数true，可设置为后台线程随着程序结束而结束，否则任务虽然执行完了，但进程还未销毁
		- 多个TimerTask任务，按队列的方式一个一个被顺序执行，但可能由于前面的任务也偶可能消耗的时间较长，则后面的任务运行的时间也会被延迟，与设置的不一致
		- timer.schedule(TimerTask task,Date firstTime,long period)周期循环执行
		- TimerTask类的cancel()方法，将某个任务从任务队列中清除；而Timer类的cancel()方法是将所有任务都清空（但也可能因为抢不到锁所以没有被执行）
	- 方法scheduleAtFixedRate(TimerTask task,Date firstTime,long period)和方法schedule(TimerTask task,Date firstTime,long period)对比
		- 区别 是否具有追赶执行性：其他同，只有当不延时（即前面执行任务都按设置值执行时）时，当设置值早于当前时间，schedule会从当前时间执行，而前一方法会从设置值时间开始打印/执行起，准确说，是以当前时间补充性完成从设置值时间开始该执行的次数