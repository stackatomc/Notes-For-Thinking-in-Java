package com.stackatomc.Multithread.chapter01;

/**
 * @author MayerFang
 * @file Run1
 * @Description
 * @date 2018/9/11
 */
class MyThread01 extends Thread{

    @Override
    public void run(){
        super.run();
        System.out.println("This is MyThread01");
    }

}

public class Run1 {

    public static void main(String[] args) {
        MyThread01 myThread01=new MyThread01();
        myThread01.start();
        System.out.println("运行结束!");
    }
}
