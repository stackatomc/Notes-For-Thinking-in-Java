package com.stackatomc.exercise02;

/**
 * @Description: 测试基本类型与包装类的自动装箱 Integer.getClass()运行时类类型
 * @User: stackc
 * @Date: 2018/7/15 20:13
 * @Version: 1.0
 */
public class TestAutoBox {

    /* int 基本类型应该需要反射才可以获得类型 */
    static int i=1;

    Integer i2=i;

    public static void main(String[] args) {

        TestAutoBox testAutoBox=new TestAutoBox();

        System.out.println("Integer i2 赋值后运行时类类型是:"+testAutoBox.i2.getClass());

    }

}/*Output:
Integer i2 赋值后运行时类型是:class java.lang.Integer
*/
