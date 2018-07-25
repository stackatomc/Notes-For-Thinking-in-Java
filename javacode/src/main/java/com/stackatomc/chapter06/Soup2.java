package com.stackatomc.chapter06;

/**
 * @Description: 简单涉及权限的单例模式实现
 * @Author: stackc
 * @Date: 2018/7/25 19:26
 * @Version: 1.0
 */
class Soup2 {

    private Soup2(){};
    static Soup2 s2=new Soup2();
    public static Soup2 makeSoup2(){
        return s2;
    }
    void f(){
        System.out.println("f() from Soup2 class ");
    }

}
