package com.stackatomc.Multithread.chapter01;

/**
 * @author MayerFang
 * @file Run7
 * @Description
 * @date 2018/9/11
 */

class MyThread07 extends Thread{
    @Override
    public void run(){
        super.run();
        while(true){
            if(this.isInterrupted()){
                return;
            }
            System.out.println(System.currentTimeMillis());
        }
    }
}

public class Run7 {

}
