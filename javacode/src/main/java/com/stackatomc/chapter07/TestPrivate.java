package com.stackatomc.chapter07;

/**
 * @File: TestPrivate.java
 * @Description:
 * @Author: MayerFang
 * @Date: 2018/8/18 19:35
 * @Version: 1.0
 * @Notes:
 * TestPrivate{...
 * private String name="pri";
 * private void sayHello(){
 *     System.out.println("sayhello");
 * }
 *
 * TestPrivate a=new B();
 * a.sayHello(); //私有方法和私有变量一样，根据类型来判断选择值
 * a.sayB();
 */
public class TestPrivate {

    private String name="pri";
    private void sayHello(){
        System.out.println("sayhello");
    }

    public void sayB(){
        System.out.println("sayb");
    }

    public static void main(String[] args) {

        TestPrivate a=new B();
        a.sayHello(); //私有方法和私有变量一样，根据类型来判断选择值
        a.sayB();

    }
}



class B extends TestPrivate{

    private void sayHello(){
        System.out.println("o");
    }

    public void sayB(){
        System.out.println("oo");
    }
}
