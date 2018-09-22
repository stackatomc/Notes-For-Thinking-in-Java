package com.stackatomc.Multithread.chapter01;

/**
 * @author MayerFang
 * @file MySuspend
 * @Description
 * @date 2018/9/22
 */
public class MySuspend {

    public static void main(String[] args) {
        try{
            MyThread thread=new MyThread();
            thread.start();
            thread.suspend();
            System.out.println("A="+System.currentTimeMillis()+"    "
                    +"i="+thread.getId());
            //抛中断异常
            Thread.sleep(5000);
            System.out.println("A="+System.currentTimeMillis()+"    "
                    +"i="+thread.getId());

            thread.resume();
            Thread.sleep(5000);
            System.out.println();

            thread.suspend();
            System.out.println("B="+System.currentTimeMillis()+"    "
                    +"i="+thread.getId());
            //抛中断异常
            Thread.sleep(5000);
            System.out.println("B="+System.currentTimeMillis()+"    "
                    +"i="+thread.getId());

        }catch(InterruptedException e){
            System.out.println("抛中断异常");
            e.printStackTrace();
        }
    }

}

class MyThread extends Thread{


    private long id=0;
    public void setId(long id){
        this.id=id;
    }
    public long getId(){
        return id;
    }

    @Override
    public void run(){
        while(true){
            id++;
        }
    }
}
