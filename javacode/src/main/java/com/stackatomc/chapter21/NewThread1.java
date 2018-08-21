package com.stackatomc.chapter21;

/**
 * @Description: 实现Runnable接口执行多线程
 * @Author: Mayer
 * @Date: 2018/7/28 1:19
 * @Version: 1.0
 */
public class NewThread1 implements Runnable{

    Thread t;
    NewThread1(){
        t=new Thread(this,"通过Runnable实现多线程");
        System.out.println("Child Thread:["+this+"]");
        t.start();
    }


    @Override
    public void run(){
        try{
            for(int i=5;i>0;--i){
                System.out.println("Inner Thread : "+i);
                t.sleep(50);   //不知为何用 Thread.sleep(50);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("Inner Thread exiting");
        }
    }

    public static void main(String[] args) {
        NewThread1 newThread1=new NewThread1();
        /* 1 注意这里不需要再直接调用run()方法，前面start()即已经是可运行状态*/
        //newThread1.run();
        try{
            for(int i=5;i>0;--i){
                System.out.println("Outer Thread : "+i);
                newThread1.t.sleep(100);    //不知为何用 Thread.sleep(100);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Outer Thread exiting");
        }
    }
}
