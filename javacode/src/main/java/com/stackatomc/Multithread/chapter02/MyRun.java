package com.stackatomc.Multithread.chapter02;

/**
 * @author MayerFang
 * @file MyRun
 * @Description
 * @date 2018/9/28
 */
public class MyRun {

    public static void main(String[] args)throws InterruptedException {
        MyOneList list=new MyOneList();
        MyThread1 thread1=new MyThread1(list);
        thread1.setName("A");
        thread1.start();
        MyThread2 thread2=new MyThread2(list);
        thread2.setName("B");
        thread2.start();
        Thread.sleep(6000);
        System.out.println(list.getSize());
        //Output:2 说明重复AB都进入了list.getSize()<1的判断
    }
}
