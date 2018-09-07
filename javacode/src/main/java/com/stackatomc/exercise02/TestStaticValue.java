package com.stackatomc.exercise02;

/**
 * @Description: 三种方式调用static变量(类名,实例,直接调用)
 * @User: Mayer
 * @Date: 2018/7/15 20:10
 * @Version: 1.0
 */
public class TestStaticValue {

    static int i=18;

    public static void main(String[] args) {

        System.out.println("通过类名调用:"+ TestStaticValue.i);
        TestStaticValue testStaticValue=new TestStaticValue();
        System.out.println("通过实例来调用:"+testStaticValue.i);
        System.out.println("类中直接调用:"+i);
    }

}/* Output:
通过类名调用:18
通过实例来调用:18
类中直接调用:18
*/
