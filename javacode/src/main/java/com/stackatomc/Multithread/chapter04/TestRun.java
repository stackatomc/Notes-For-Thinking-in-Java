package com.stackatomc.Multithread.chapter04;

/**
 * @author MayerFang
 * @file TestRun
 * @Description
 * @date 2018/10/1
 */
public class TestRun {

    public static void main(String[] args) {
        try{
            MyService s=new MyService();
            MyThreadA a=new MyThreadA(s);
            a.start();

            Thread.sleep(6000);
            //s.signal();
//            MyThreadB b=new MyThreadB(s);
//            b.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
