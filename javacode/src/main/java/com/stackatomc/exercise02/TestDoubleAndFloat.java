package com.stackatomc.exercise02;

/**
 * @Description: 对比double与float的默认初始化值,均为0.0, 没有后面d或者f的标识
 * @User: stackc
 * @Date: 2018/7/15 20:01
 * @Version: 1.0
 */
public class TestDoubleAndFloat {

    static double d;

    static float f;

    public static void main(String[] args) {

        System.out.println("double d初始化默认为:"+d);

        System.out.println("double f初始化默认为:"+f);
    }

}/* Output:
double d初始化默认为:0.0
double f初始化默认为:0.0
*/
