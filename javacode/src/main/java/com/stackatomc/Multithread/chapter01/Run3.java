package com.stackatomc.Multithread.chapter01;

/**
 * @author MayerFang
 * @file Run3
 * @Description
 * @date 2018/9/11
 */

class MyRunnable01 implements Runnable{

    @Override
    public void run(){
        System.out.println("运行中");
    }
}
public class Run3 {

    public static void main(String[] args) {
        Runnable runnable01=new MyRunnable01();
        //Thread(Runnable);Thread(Runnable target,String name);Thread(ThreadGroup p,Runnable target,String name);
        Thread thread=new Thread(runnable01);
        thread.start();
        System.out.println("运行结束");
    }
}
