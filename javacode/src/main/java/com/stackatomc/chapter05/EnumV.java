package com.stackatomc.chapter05;

/**
 * @Description: 枚举类的简单使用
 * @Author: stackc
 * @Date: 2018/7/24 21:23
 * @Version: 1.0
 * @Notes
 * 1 枚举类 Enum.values()获取所有，遍历单个，ordinal()可以输出enum中位置从0开始
 * 2 枚举类 搭配 switch case 使用
 * 3 枚举类经常是直接类名.值方式调用
 */
public class EnumV {
    EnumDatas en;

    public void judgeE(EnumDatas en){
        switch(en){
            case FEN:
                System.out.println("fem here");
                break;
            case JIAO:
                System.out.println("jiao here");
                break;
            default:
                System.out.println("byebye");
        }
    }

    public static void main(String[] args) {
        for(EnumDatas e: EnumDatas.values()){
            System.out.println(e+",original:"+e.ordinal());
        }
        EnumV ev=new EnumV();
        ev.judgeE(EnumDatas.FEN);

    }
}
