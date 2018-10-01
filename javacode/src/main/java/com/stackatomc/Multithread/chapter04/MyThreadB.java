package com.stackatomc.Multithread.chapter04;

/**
 * @author MayerFang
 * @file MyThreadA
 * @Description
 * @date 2018/10/1
 */
public class MyThreadB extends Thread{

    private MyService myService;
    public MyThreadB(MyService myService){
        super();
        this.myService=myService;
    }

    @Override
    public void run(){
        myService.signal();
    }
}
