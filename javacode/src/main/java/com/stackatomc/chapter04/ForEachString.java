package com.stackatomc.chapter04;

/**
 * @Description: foreach 对字符串逐个输出
 * @User: stackc
 * @Date: 2018/7/22 19:34
 * @Version: 1.0
 * @Notes
 * 1 foreach 即 for(char c: char[] array) 可用于对单个文字进行输出
 * 2 str.toCharArray 方法将一行String转换成char的数组
 * 3 for(obj,Object[]) 这种经常用于对象整体数组中
 */
public class ForEachString {

    public static void main(String[] args) {

        System.out.println("foreach char : char[] ");
        char[] carray={'1','2','3'};
        for(char c:carray){
            System.out.print(c);
        }

        System.out.println();

        System.out.println("foreach char : str.toCharArray ");
        String str="Hello.I'm here.";
        for(char c:str.toCharArray()){
            System.out.print(c+" ");
        }
    }
}
