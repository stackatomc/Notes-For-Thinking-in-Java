package com.stackatomc.tools;

/**
 * @author MayerFang
 * @file MyDoubleRun1
 * @Description DCL双重锁机制，多线程单例
 * @date 2018/10/2
 */
public class MyDoubleRun1 {

    public static void main(String[] args) {
        MyThread1 m1=new MyThread1();
        MyThread2 m2=new MyThread2();
        m1.start();
        m2.start();
    }
}

class MyObject{
    private MyObject(){}
    private volatile static MyObject m;

    public static MyObject getInstance(){
        try{
            if(m==null){
                Thread.sleep(3000);
                synchronized (MyObject.class){
                    if(m==null){
                        m=new MyObject();
                    }
                }
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return m;
    }
}

class MyThread1 extends Thread{

    public MyObject m1;

    @Override
    public void run(){
        m1= MyObject.getInstance();
        System.out.println(m1.hashCode());
    }
}

class MyThread2 extends Thread{

    public MyObject m2;

    @Override
    public void run(){
        m2= MyObject.getInstance();
        System.out.println(m2.hashCode());
    }
}