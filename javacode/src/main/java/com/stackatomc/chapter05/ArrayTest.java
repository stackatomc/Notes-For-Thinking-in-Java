package com.stackatomc.chapter05;

import java.util.Arrays;

/**
 * @Description: 数组遍历打印方式3种 foreach/String... array/Arrays.toString(array)
 * @Author: Mayer
 * @Date: 2018/7/24 20:52
 * @Version: 1.0
 * @Notes
 * 1 普通foreach打印数组
 * 2 不带参...新打印数组，String... array这样的方式传入，可变参数列表,可为空
 * 3 带参...新打印数组
 * 4 Object是非基本数据类型，是对象，如String、包装类等才是继承了Object。基本数据类型不是
 * //!printA1(aobj); 基本类型数组视作一个数组整体，数组才是一个Object对象。而该方法传入应该是Object[]数组
 * 5 Arrays.toString() 强有力，支持基本数据类型数组和Object[]
 */
public class ArrayTest {

    /* 1 普通foreach打印数组 */
    public static void printA1(Object[] array){
        int i=0;
        for(Object obj:array){
            i++;
            System.out.print(i+":");
            System.out.println(obj);
        }
    }


    /* 2 不带参...新打印数组，String... array这样的方式传入，可变参数列表,可为空 */
    public static void printA2(String... array){
        System.out.println("正在执行printA2");
        for(String obj:array){
            System.out.println(obj);
        }
    }

    /* 3 带参...新打印数组 */
    public static void printA3(int count,String... array){
        System.out.println("正在执行printA3");
        for(String obj:array){
            count++;
            System.out.print(count+":");
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        //4 Object是非基本数据类型，是对象，如String、包装类等才是继承了Object。基本数据类型不是
        int[] a=new int[]{1,2,3};
        Object aobj=a;
        //!printA1(aobj); 基本类型数组视作一个数组整体，数组才是一个Object对象。而该方法传入应该是Object[]数组

        System.out.println("==============");
        Integer[] a1=new Integer[]{1,2,3};
        printA1(a1);
        System.out.println("==============");
        String[] a2=new String[]{"1","2","3"};
        printA2(a2);
        printA2("one","two");
        printA2();
        System.out.println("==============");
        printA3(0,a2);
        printA3(0);

        /*5 Arrays.toString() 强有力，支持基本数据类型数组和Object[] */
        Arrays.toString(a);
        Arrays.toString(a1);
        Arrays.toString(a2);

    }
}
