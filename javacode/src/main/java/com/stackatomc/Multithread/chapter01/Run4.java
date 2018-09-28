package com.stackatomc.Multithread.chapter01;

/**
 * @author MayerFang
 * @file Run4
 * @Description
 * @date 2018/9/11
 */

class MyThread04 extends Thread{

    private int count=3;

    public MyThread04(){
        super();
    }

    public MyThread04(String name){
        /*  public Thread() {init(null, null, "Thread-" + nextThreadNum(), 0);}   */
        super();
        this.setName(name);
    }

    @Override
    public synchronized void run(){

        try{
            super.run();
            while(count>0){
                //if(count>0){
                count--;
                System.out.println(this.currentThread().getName()+":"+count);
                currentThread().interrupt();
                if(Thread.interrupted()){
                    break;
                }
         }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
public class Run4 {

    public static void main(String[] args) {

        //不共享数据（实例变量）
        MyThread04 ta = new MyThread04("A");
        MyThread04 tb = new MyThread04("B");
        MyThread04 tc = new MyThread04("C");
        MyThread04 td = new MyThread04("D");
//        ta.start();
//        tb.start();
//        tc.start();
//        td.start();

        //共享数据
        MyThread04 t5=new MyThread04();
        Thread threadA=new Thread(t5,"A");
        Thread threadB=new Thread(t5,"B");
        Thread threadC=new Thread(t5,"C");
        Thread threadD=new Thread(t5,"D");
        threadA.start();

        threadB.start();
        threadC.start();
        threadD.start();
    }
}