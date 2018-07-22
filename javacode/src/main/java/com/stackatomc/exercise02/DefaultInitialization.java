package com.stackatomc.exercise02;

/**
 * @Description: 验证Java的初始化,特别针对char类型的初始化值
 * @User: stackc
 * @Date: 2018/7/15 19:00
 * @Version: 1.0
 */
public class DefaultInitialization {

    int i;

    /* 1.char 默认输出为'\0000'不可见控制符,所以不会输出，而MIX_VALUE='\0000'，所以显示不出
    * 参考来源: https://www.jianshu.com/p/577aad377523
    * 控制台: 测试过也无法输出,留出一个空位,没有字符亦需知不是空格('\u0020'为其unicode编码)*/
    char c;

    public static void main(String[] args) {

        /* 2.注意先实例化对象，才可以对成员变量进行访问 */
        DefaultInitialization e01=new DefaultInitialization();

        System.out.println("int i 默认初始化为: "+ e01.i);

        System.out.println("char c 默认初始化为: "+"["+e01.c+"]");
        if(e01.c == '\u0000'){
            System.out.println("true");
        }
    }

}
/* Output:
int i 默认初始化为: 0
char c 默认初始化为: [ ]
true
* */
