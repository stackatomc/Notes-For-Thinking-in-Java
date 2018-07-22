package com.stackatomc.exercise03;

/**
 * @Description: 移位操作符 << >> >>>
 * @User: stackc
 * @Date: 2018/7/22 18:42
 * @Version: 1.0
 * @Notes
 * 1 << 向左位移
 * 2 >> 有符号向右位移
 * 3 >>> 无符号向右位移,置为0
 * 注意：向右位移，则删除后面的，前面看情况置符号
 *  并且只有数值右端的低5位才有效，这点不是很明白。关于2的5次方位32，放置位移超过long型数值具有的位数（通过>>不是32吗？）
 */
public class exercise11 {

    public static void main(String[] args) {
        int a=Integer.MIN_VALUE; //1010
        System.out.println("Integer.MIN_VALUE = "+a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println("a>>31 = "+(a>>31)); //1111010 有符号右移 0001
        System.out.println(Integer.toBinaryString(a>>31));
        System.out.println("a>>>31 = "+(a>>>31)); //0001010 无符号右移 0001 实际移动超过32已不存在
        System.out.println(Integer.toBinaryString(a>>>31));

        System.out.println("======================");

        int a1=0x0A; //1010
        System.out.println("a1 = "+a1);
        System.out.println(Integer.toBinaryString(a1));
        System.out.println("a1>>1 = "+(a1>>5)); //1111010 有符号右移 0001
        System.out.println(Integer.toBinaryString(a1>>5));
        System.out.println("a1>>>1 = "+(a1>>>5)); //0001010 无符号右移 0001 实际移动超过32已不存在
        System.out.println(Integer.toBinaryString(a1>>>5));

    }
}/*Output:
Integer.MIN_VALUE = -2147483648
10000000000000000000000000000000
a>>31 = -1
11111111111111111111111111111111
a>>>31 = 1
1
*/
