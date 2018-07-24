package com.stackatomc.chapter05;

/**
 * @Description: 静态类初始化和非静态类初始化方法执行顺序和区别
 * @Author: stackc
 * @Date: 2018/7/24 19:55
 * @Version: 1.0
 * @Notes
 * 1 静态类初始化方法 static{}，只执行一次
 * 2 非静态类初始化方法 {} ，每次创建对象都会执行
 */

class Cup{
    Cup(int marker){
        System.out.println("Cup("+marker+")");
    }
    void f(int marker){
        System.out.println("f("+marker+")");
    }
}

class Cups{
    static Cup cup1;
    static Cup cup2;
    /* 1 静态类初始化，只执行一次 */
    static{
        cup1=new Cup(1);
        cup2=new Cup(2);
    }
    /* 2 非静态类初始化，每次创建对象都会执行  */
//    {
//        cup1=new Cup(1);
//        cup2=new Cup(2);
//    }
    Cups(){
        System.out.println("Cups()");
    }
}

public class ExplitcitStatic {

    public static void main(String[] args) {
        System.out.println("Inside main()");
        //Cups.cup1.f(99);
    }
    static Cups cup1=new Cups();
    static Cups cup2=new Cups();
}
