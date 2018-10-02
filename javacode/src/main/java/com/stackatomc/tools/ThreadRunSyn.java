package com.stackatomc.tools;

/**
 * @author MayerFang
 * @file ThreadRunSyn
 * @Description 依次轮流打印多线程
 * @date 2018/10/2
 */
public class ThreadRunSyn {

    public static void main(String[] args) {
        Object lock=new Object();
        ThreadSyn ta=new ThreadSyn(lock,"A",0);
        ThreadSyn tb=new ThreadSyn(lock,"B",1);
        ThreadSyn tc=new ThreadSyn(lock,"C",2);
        ta.start();
        tb.start();
        tc.start();
    }

}

class ThreadSyn extends Thread{

    private Object lock;
    private String name;
    private int n;

    public ThreadSyn(Object lock,String name,int n){
        super();
        this.lock=lock;
        this.name=name;
        this.n=n;
    }

    private int printCount=0;
    volatile private static int addNumber=0;

    @Override
    public void run(){
        try{
            System.out.println("Log-----"+Thread.currentThread().getName());
            synchronized (lock){
                System.out.println("Log0-----"+Thread.currentThread().getName());
                while(true){
                    System.out.println("Log1-----"+Thread.currentThread().getName());
                    if(addNumber%3==n){
                        System.out.print(Thread.currentThread().getName()+" "+n);
                        System.out.println();
                        System.out.println("Log2-----"+Thread.currentThread().getName());
                        lock.notifyAll();
                        System.out.println("Log3-----"+Thread.currentThread().getName());
                        addNumber=addNumber+1;
                        printCount=printCount+1;
                        if(printCount==3)break;

                    }else{
                        System.out.println("Log4-----"+Thread.currentThread().getName());
                        lock.wait();

                    }
                }
                System.out.println("Log5-----"+Thread.currentThread().getName());
                System.out.println("JUST BREAK");
            }
            }catch(InterruptedException e){
                e.printStackTrace();
            }



}}
