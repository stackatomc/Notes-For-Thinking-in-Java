package com.stackatomc.exercise03;

/**
 * @Description: 按位操作符 & | ^ ~
 * @User: stackc
 * @Date: 2018/7/21 23:56
 * @Version: 1.0
 * @Notes
 * a=1101 13
 * b=1111 15
 * a&b=1101 与&
 * a|b=1111 或|
 * a^b=0010 异或(如果a、b两个值不相同，则异或结果为1。如果a、b两个值相同，异或结果为0)
 * ~a=0010 取反~
 */
public class exercise10 {

    public static void main(String[] args) {
        int a=13;
        int b=15;
        System.out.println("a&b:"+Integer.toBinaryString(a&b));
        System.out.println("a|b:"+Integer.toBinaryString(a|b));
        System.out.println("a^b:"+Integer.toBinaryString(a^b));
        System.out.println("~a:"+Integer.toBinaryString(~a));
    }
}
