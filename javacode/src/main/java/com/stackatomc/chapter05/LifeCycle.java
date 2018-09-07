package com.stackatomc.chapter05;

/**
 * @Description: 验证初始化顺序，{} 非静态初始化就是普通的方法，类似匿名调用所以每次都调用这样
 * @Author: Mayer
 * @Date: 2018/7/24 20:37
 * @Version: 1.0
 */
public class LifeCycle {
    // 静态属性
    private static String staticField ="静态属性";


    // 静态方法
    public static void getStaticField() {
        System.out.println("静态方法");
    }
    // 静态初始化方法块
    static {
        System.out.println(staticField);
        getStaticField();
        System.out.println("静态方法块初始化");
    }

    // 普通属性
    private String field = "普通属性";

    //非静态初始化块
    {
        System.out.println(field);
        getField();
        System.out.println("普通方法块初始化");
    }

    // 普通方法
    public String getField() {
        String filed = "Field Initial";
        System.out.println("普通方法");
        return filed;
     }

    // 构造函数
    public LifeCycle() {
        System.out.println("构造函数初始化");
        System.out.println("Structure Initial ");
    }

        // 主函数
    public static void main(String[] argc) {
        new LifeCycle();
    }
}