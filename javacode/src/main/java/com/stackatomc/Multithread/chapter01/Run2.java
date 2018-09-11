package com.stackatomc.Multithread.chapter01;

/**
 * @author MayerFang
 * @file Run2
 * @Description
 * @date 2018/9/11
 */

class MyThread02 extends Thread{
    @Override
    public void run(){
        super.run();
        System.out.println(this.currentThread().getName());
    }
}
public class Run2 {

    public static void main(String[] args) {
        MyThread02 t1=new MyThread02();
        MyThread02 t2=new MyThread02();
        MyThread02 t3=new MyThread02();
        t1.start();
        t2.start();
        t3.start();

    }
}
