package com.stackatomc.chapter03;

/**
 * @Description: 三元操作符 boolean-exp ? value0 : value1
 * @User: Mayer
 * @Date: 2018/7/22 0:10
 * @Version: 1.0
 * @Notes
 * public int threeOp(int x,int y){
 *       return x>0 ? y*100 : x*100;
 *  }
 */
public class TernaryIfElse {
    public int threeOp(int x,int y){
        return x>0 ? y*100 : x*100;
    }

    public static void main(String[] args) {
        TernaryIfElse testObj=new TernaryIfElse();
        System.out.println("Output:"+testObj.threeOp(2,3));
    }
}
