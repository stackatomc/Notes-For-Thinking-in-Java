package com.stackatomc.chapter03;

/**
 * @Description:
 * @User: Mayer
 * @Date: 2018/7/16 20:05
 * @Version: 1.0
 */
public class Assignment {

    public static void main(String[] args) {
        /*Integer包装类实例*/
        Integer i1=123;
        Integer i2=123;//Output: i1==i2,即表示i1与i2指向同一地址，为同一对象
        Integer i3=129;
        Integer i4=129;//Output: i3!=i4,即表示i3与i4为不同对象

        /* 具体以Short包装类分析源码 */
        /* 结论: Integer Short Long 相同*/
        Short s1=120;
        Short s2=120;//Output: s1==s2,即表示s1与s2指向同一地址，为同一对象
        Short s3=-129;
        Short s4=-129;//Output: s3!=s4,即表示s3与s4为不同对象

        /*Float与Double包装类例外，以Double分析源码*/
        Double d1=1.0d;
        Double d2=1.0d;//Output: d1!=d2,即表示d1与d2为不同对象

        //Byte s1=(byte)300;未知
        //Byte s2=(byte)300;
    }
}
