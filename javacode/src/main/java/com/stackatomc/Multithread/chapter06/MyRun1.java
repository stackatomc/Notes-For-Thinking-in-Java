package com.stackatomc.Multithread.chapter06;

/**
 * @author MayerFang
 * @file MyRun1
 * @Description 饿汉模式和懒汉模式
 * @date 2018/10/2
 */
public class MyRun1 {

    public static void main(String[] args) {
        //1. 饿汉模式
        MyObject1 m1=MyObject1.getMyObject1();
        //2. 懒汉模式
        MyObject2 m2=MyObject2.getMyObject2();
    }
}

class MyObject1{
    private MyObject1(){}
    private static MyObject1 m1=new MyObject1();
    public static MyObject1 getMyObject1(){
        return m1;
    }
}

class MyObject2{
    private MyObject2(){}
    private static MyObject2 m2;

    public static MyObject2 getMyObject2(){
        if(m2==null){
            return new MyObject2();
        }
        return m2;
    }
}