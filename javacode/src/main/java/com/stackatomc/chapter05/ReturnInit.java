package com.stackatomc.chapter05;

/**
 * @Description: 重载方法与返回类型无关，同参数列表情况下方法名相同则为同意方法，与返回类型无关，编译器报错
 * @Author: stackc
 * @Date: 2018/7/22 23:41
 * @Version: 1.0
 * @Notes
 * 1 这里参数列表一样的方法情况下，试图进行返回值类型的方法重载会报错，仅在参数不一致时才可定义不同返回值
 * 准确说方法重载关于同方法名下参数列表是否相同，与返回值类型无关，不可因此判断
 * 2 参数名只是一种引用，相当愚蠢的坚持证明了一下，报错
 * 3 所以函数重载只是对参数个数、类型、顺序进行重载，与返回类型和参数名无关
 */
public class ReturnInit {

    public void printWord(int i){
        System.out.println(i+1909);
    }

    //!* 2 参数名只是一种引用，相当愚蠢的坚持证明了一下，报错 */
    //public void printWord(int j){
    //
    //}

    /* 1 这里参数列表一样的方法返回值试图方法重载会报错 */
    //!String printWord(String str){
    //    return "your are wrong";
    //}

    public static void main(String[] args) {

    }
}
