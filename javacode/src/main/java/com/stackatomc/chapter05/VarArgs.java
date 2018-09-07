package com.stackatomc.chapter05;

/**
 * @Description: Object... obj 方法可面向任意类型
 * @Author: Mayer
 * @Date: 2018/7/25 20:39
 * @Version: 1.0
 */

class A{}

public class VarArgs {

    public void printObj(Object... objarray){
        for(Object obj: objarray){
            System.out.print(obj);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        VarArgs varArgs=new VarArgs();
        varArgs.printObj(new Object[]{"one",1,new A(),new A(),new A()});
        varArgs.printObj(new Object[]{"one","two","three"});
        varArgs.printObj(new Object[]{1,2,3});
    }
}/*Output:
one1com.stackatomc.chapter05.A@154617ccom.stackatomc.chapter05.A@a14482com.stackatomc.chapter05.A@140e19d
onetwothree
123
*/
