package com.stackatomc.chapter06;

/**
 * @Description: 简单涉及权限的单例模式实现
 * @Author: Mayer
 * @Date: 2018/7/25 19:27
 * @Version: 1.0
 * @Notes
 *
 * /* 这种表达不容易体现出Soup2的单例模式
 * //!Soup2 soup2=Soup2.makeSoup2();
 *       Soup2.makeSoup2().f();
 * */
public class Lunch {

    public static void main(String[] args) {
        /*
        * Soup1:
        * private Soup1(){};
        * public static Soup1 makeSoup1(){
        * return new Soup1(); }
        *
        * */
        Soup1 soup1=Soup1.makeSoup1();
        soup1.f();

        /*
        * Soup2：
        * 这种是单例模式singleton
        * private Soup2(){};
        * static Soup2 s2=new Soup2();
        * public static Soup2 makeSoup2(){
        * return s2;}
        * */

        /* 这种表达不容易体现出Soup2的单例模式*/
        //!Soup2 soup2=Soup2.makeSoup2();
        Soup2.makeSoup2().f();
    }
}
