package com.stackatomc.chapter05;

/**
 * @Description: byte char short int 自动转型类型提升
 * @Author: Mayer
 * @Date: 2018/7/23 0:01
 * @Version: 1.0
 * @Notes
 * 1 char 是16bit byte是8bit short也是16bit 所以char自动转型为int类型
 * 2 char无符号，由于范围不同，自动转型类型提升是由小范围到大范围所以byte转型为short而非char
 */
public class CharAndByte {


    //public void rev(byte b){System.out.println("rev(byte b)");}
    public void rev(char c){System.out.println("rev(char c)");}
    public void rev(short s){ System.out.println("rev(short s)"); }
    public void rev(int i){System.out.println("rev(int i)");}

    public static void main(String[] args) {

        char c='c';
        CharAndByte cabTest=new CharAndByte();
        cabTest.rev(c); //1 char 是16bit byte是8bit short也是16bit 所以char自动转型为int类型
        byte b='1';
        cabTest.rev(b); //2 char无符号，由于范围不同，自动转型类型提升是由小范围到大范围所以byte转型为short而非char
    }
}/*Output:
rev(char c)
rev(short s)
*/
