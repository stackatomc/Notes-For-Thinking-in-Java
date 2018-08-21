package com.stackatomc.chapter13;

/**
 * @Description: 利用Math.round()去小数位前两位，四舍五入
 * @Author: Mayer
 * @Date: 2018/7/28 15:22
 * @Version: 1.0
 * @Notes
 * 1 Math.round()返回类型可以为float和double
 */
public class RoundTest {

    public static void main(String[] args) {

        double d=123.456789d;
        //保留小数位后两位，四舍五入
        double d1=d*100;
        System.out.println("d1 = "+d1);
        double r1=Math.round(d1);
        r1=Math.round(d1)/100;//这里输出结果不对，精度丢失了
        System.out.println("r1 = "+r1/100); //r1 = 123.0;修改后可以，r1 = 123.46；

        //去小数位前两位，四舍五入
        //保留小数位后两位，四舍五入
        double d2=d/100;
        System.out.println("d2 = "+d2);
        double r2=Math.round(d2)*100;
        System.out.println("r2 = "+r2);
    }
}
