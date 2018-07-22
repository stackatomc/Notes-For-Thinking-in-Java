package com.stackatomc.exercise03;

/**
 * @Description: 指数记数法 1e-45
 * @User: stackc
 * @Date: 2018/7/21 23:42
 * @Version: 1.0
 * @Notes
 * 1.4E-45 这样的表达是1.4e^(-45) 在Java中表示1.4*10^(-45)
 * 2.另外对大部分包装类提供有MIN_VALUE,MAX_VALUE等静态常量 Float.MAX_VALUE
 */
public class exercise09 {

    public static void main(String[] args) {
        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Character.MIN_VALUE = " + Character.MAX_VALUE);
    }
}/*Output:
Float.MIN_VALUE = 1.4E-45
Integer.MIN_VALUE = -2147483648
Double.MIN_VALUE = 4.9E-324
Character.MIN_VALUE = ￿

*/
