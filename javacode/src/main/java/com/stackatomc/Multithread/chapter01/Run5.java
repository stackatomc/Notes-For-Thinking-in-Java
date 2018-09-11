package com.stackatomc.Multithread.chapter01;

/**
 * @author MayerFang
 * @file Run5
 * @Description
 * @date 2018/9/11
 */

class MyThread05 extends Thread{
    @Override
    public void run(){
        super.run();
        try{
            for(int i=0;i<5;i++){
                if(this.interrupted()){
                    System.out.println("已经是停止状态！进入this.interrupted()");
                    //break; 解决for下面语句仍可打印出的问题，用try catch抛出异常来解决
                    throw new InterruptedException();
                }
                System.out.println("i="+(i+1));
            }

            System.out.println("for()中break出后，for下面的语句还可以执行");
        }catch(InterruptedException e){
            System.out.println("进入catch,InterruptedException");
            e.printStackTrace();
        }


    }
}

public class Run5 {

    public static void main(String[] args) {
        MyThread05 m05=new MyThread05();
        m05.start();
        //Thread.sleep(1000);
        m05.interrupt();
        System.out.println("结束了！");
    }
}
