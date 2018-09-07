package com.stackatomc.chapter03;

/**
 * @Description: 短路 &&
 * @User: Mayer
 * @Date: 2018/7/21 23:11
 * @Version: 1.0
 *
 * @Notes
 * if((str!=null)&&str.equals("")) 常用于判断表单填写或数据库数据交互方面
 */
public class ShortCircuit {

    public static void main(String[] args) {

        String str=null;
        if((str!=null)&&str.equals("")){
            System.out.println(" 短路现象 ");
        }
    }
}
