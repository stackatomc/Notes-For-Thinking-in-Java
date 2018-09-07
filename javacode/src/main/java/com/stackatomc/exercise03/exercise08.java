package com.stackatomc.exercise03;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @Description: 编译器使用API指定生成数据类型,使用toBinaryString(数据类型) 可转换为二进制输出
 * @User: Mayer
 * @Date: 2018/7/21 23:16
 * @Version: 1.0
 *
 * @Notes
 * i=0x11; // Hexadecimal 0x[0-F][0-F] 0x 等于0X
 * i=0111; // Octal 0[0-7][0-7][0-7]
 * Integer.toBinaryString(i);
 */
public class exercise08 {

    public static void main(String[] args) {
        int i1=0x2f; //Hexadecimal(lowercase)
        System.out.println("i1:"+i1); /* i1:47 */
        System.out.println("i1:"+Integer.toBinaryString(i1));/* i1:101111*/

        /* Integer.toBinaryString(Hexdecimal i) 指定以二进制方式输出*/
        int i2=0X2F;
        System.out.println("i2:"+Integer.toBinaryString(i2));/* i2:101111*/

        //! 这里不明白输出,int i3=0177=127吗
        int i3=0177; //Octal(leading zero)
        System.out.println("i3:"+Integer.toBinaryString(i3)); /* i2:101111*/

        long loct=0101; //Octal 0101(8)=65
        System.out.println("loct:"+loct);
        System.out.println("lo:"+Long.toBinaryString(loct)); /* loct:1000001*/

        long lhex=0x01; //Hexadecimal 0x01(16)=1
        System.out.println("lhex:"+lhex);
        System.out.println("lhex:"+Long.toBinaryString(lhex)); /* lhex:1 */

        long l=10; // 10
        System.out.println("l:"+l);
        System.out.println("l:"+Long.toBinaryString(l)); /* l:1 */
    }

}
