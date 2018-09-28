package com.stackatomc.Multithread.chapter02;

/**
 * @author MayerFang
 * @file MyThread2
 * @Description
 * @date 2018/9/28
 */
public class MyThread2 extends Thread{

    private MyOneList list;

    public MyThread2(MyOneList list){this.list=list; }

    public void run(){
        MyService myService=new MyService();
        myService.addServiceMethod(list,"B");
    }


}