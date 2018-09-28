package com.stackatomc.Multithread.chapter02;

/**
 * @author MayerFang
 * @file MyThread1
 * @Description
 * @date 2018/9/28
 */
public class MyThread1 extends Thread{

    private MyOneList list;

    public MyThread1(MyOneList list){this.list=list; }

    public void run(){
        MyService myService=new MyService();
        myService.addServiceMethod(list,"A");
    }


}
