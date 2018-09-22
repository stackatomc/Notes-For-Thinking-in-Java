package com.stackatomc.Multithread.chapter01;

/**
 * @author MayerFang
 * @file MyYield
 * @Description
 * @date 2018/9/23
 */
public class MyYield {

    public static void main(String[] args) {
        MyThreadY1 y1=new MyThreadY1();
        y1.start();
    }
}

class MyThreadY1 extends Thread{

    @Override
    public void run(){
        long beginTime=System.currentTimeMillis();
        int count=0;
        for(int i=0;i<50000000;++i){
            //有明显差异，确实是慢，去掉注释后CPU让给其他资源导致速度变慢，而CPU独占时间片时时间约为16
            //Thread.yield();
            count=count+(i+1);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("用时="+(endTime-beginTime));
    }
}
