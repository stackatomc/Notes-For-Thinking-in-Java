package com.stackatomc.Multithread.chapter04;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author MayerFang
 * @file MyService
 * @Description
 * @date 2018/10/1
 */
public class MyService {

    private ReentrantLock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();

    public void waitMethod(){
        try{
            lock.lock();
            System.out.println("await()中...");
            condition.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally{
            lock.unlock();
            System.out.println("锁释放了！");
        }
    }

    public void signal(){
        try{
            lock.lock();
            condition.signal();
            System.out.println("唤醒了！");
        }finally{
            lock.unlock();
        }
    }
}
