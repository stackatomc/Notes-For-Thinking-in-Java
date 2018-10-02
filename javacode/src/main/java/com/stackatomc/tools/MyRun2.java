package com.stackatomc.tools;

/**
 * @author MayerFang
 * @file MyRun2
 * @Description 用静态内部类的静态参数实现多线程中的单例（原子操作吧）
 * @date 2018/10/2
 */
public class MyRun2 {

    public static void main(String[] args) {
        MyThread3 m1=new MyThread3();
        MyThread4 m2=new MyThread4();
        m1.start();
        m2.start();
    }
}

class MyObject3{
    private MyObject3(){}

    static class MyObjectHandler{
        private static MyObject3 m3=new MyObject3();
    }

    public static MyObject3 getInstance(){
        return MyObjectHandler.m3;
    }
}

class MyThread3 extends Thread{

    public MyObject3 m1;

    @Override
    public void run(){
        m1= MyObject3.getInstance();
        System.out.println(m1.hashCode());
    }
}

class MyThread4 extends Thread{

    public MyObject3 m2;

    @Override
    public void run(){
        m2= MyObject3.getInstance();
        System.out.println(m2.hashCode());
    }
}