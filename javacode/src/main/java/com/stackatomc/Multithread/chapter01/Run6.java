package com.stackatomc.Multithread.chapter01;

/**
 * @author MayerFang
 * @file Run6
 * @Description
 * @date 2018/9/11
 */

class MyThread06 extends Thread{
    private int count=50;
    @Override
    public void run(){
        super.run();
        try{
            while(count>0){
                count--;
                System.out.println(this.currentThread().getName()+":"+count);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class Run6 {

    public static void main(String[] args) {

        try{
            MyThread06 m6=new MyThread06();
            m6.start();
            Thread.sleep(8000);
            m6.stop();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }


}
