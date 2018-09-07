package com.stackatomc.chapter21;

/**
 * @Description: 继承Thread类执行多线程
 * @Author: Mayer
 * @Date: 2018/7/28 10:39
 * @Version: 1.0
 *
 */
public class NewThread2 extends Thread{

    NewThread2(){
        super("Demo Thread");
        System.out.println("Child Thread："+this);
        start();
    }

    // 第二个线程入口
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                // 让线程休眠一会
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }


    public static void main(String[] args) {
        try{
            for(int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                // 让线程休眠一会
                Thread.sleep(100);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
        }

    }
