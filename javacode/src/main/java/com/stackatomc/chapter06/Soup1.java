package com.stackatomc.chapter06;

/**
 * @Description: 简单涉及权限的单例模式实现
 * @Author: Mayer
 * @Date: 2018/7/25 19:25
 * @Version: 1.0
 */
class Soup1 {

    private Soup1(){};

    public static Soup1 makeSoup1(){
        return new Soup1();
    }

    void f(){
        System.out.println("f() from Soup1 class ");
    }
}
