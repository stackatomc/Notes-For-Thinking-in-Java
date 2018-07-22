package com.stackatomc.chapter04;

/**
 * @Description: char 字符对应了ASCII码值
 * @User: stackc
 * @Date: 2018/7/22 19:23
 * @Version: 1.0
 * @Notes
 * 1 直接输出char是默认对应了ASCII码值
 * 2 输出对应的码 使用强制类型转换 (int)c
 */
public class ListCharacters {

    public static void main(String[] args) {
        System.out.println("ASCII ：");
        for(char c=0;c<128;++c){
            System.out.print(c);
        }
        System.out.println("ASCII ：");
        for(char c=0;c<128;++c){
            if(Character.isLowerCase(c)){
                System.out.println("value: "+(int)c+" & ASCII:"+c);
            }
        }
    }
}
