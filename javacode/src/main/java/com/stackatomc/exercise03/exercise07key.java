package com.stackatomc.exercise03;

import java.util.Date;
import java.util.Random;

/**
 * @Description: 使用Random.nextBoolean();模拟扔硬币
 * @User: Mayer
 * @Date: 2018/7/21 19:58
 * @Version: 1.0
 */
public class exercise07key {

    public static void main(String[] args) {

        /* 1 这里种子数使用47 */
        Random rank=new Random(47);
        boolean flip=rank.nextBoolean();
        System.out.print("OUTPUT: ");
        System.out.println(flip?"HEAD":"TAIL");
    }
}
