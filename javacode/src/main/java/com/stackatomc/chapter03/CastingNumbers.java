package com.stackatomc.chapter03;

/**
 * @Description: 强制类型转化与四舍五入对精确度的取整/四舍五入区别
 * @User: Mayer
 * @Date: 2018/7/22 0:21
 * @Version: 1.0
 * @Notes
 * 1.强制类型转换不进行四舍五入，Math.round()才会四舍五入
 */
public class CastingNumbers {

    public static void main(String[] args) {
        double above=0.7;
        System.out.println("强制类型转换不四舍五入(int)above:"+(int)above);
        System.out.println("四舍五入用函数Math.round(0.7):"+Math.round(above));
    }
}
