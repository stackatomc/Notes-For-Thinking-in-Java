package com.stackatomc.exercise03;

import static java.lang.System.*;
import static com.stackatomc.chapter03.Print.*;//直接导入的方式
// import static net.mindview.util.Print.*; 还未成功导入

/**
 * @Description: 简化System.out.println()
 * @User: Mayer
 * @Date: 2018/7/16 18:21
 * @Version: 1.0
 * @Notes
 * 1.import java.lang.System.*; 可简化为out.println
 * 2.一种很不完整的泛型类实现，思路属于自己写辅助包形
 * 3 将作者提供类作为java文件放入同目录下
 * 4 使用improt static class.* 导入类的所有方法
 */
public class exerccise01 {

    public static void main(String[] args) {
        System.out.println("使用System.out.println()输出！");

        /* 1 import java.lang.System.*; 因为out是该包中的静态变量，类型为PrintStream
        * public final static PrintStream out = null;*/
        out.println("使用out.println()输出！");

        /* 2 一种由于知识局限很不完整的泛型类实现，思路属于自己写辅助包形 */
        SimplyPrint<String> Stringprinter=new SimplyPrint<String>();
        Stringprinter.println("SimplyPrint.println()输出！");
        SimplyPrint<Integer> Integerprinter=new SimplyPrint<Integer>();
        Integerprinter.println(11111);

        /*3 使用直接导入类实现 */
        print("直接导入类实现");

        /*4 使用improt static class.* 导入类的所有方法 */
        //print("Hello 使用improt static class.* 导入类的所有方法");
    }

}

class SimplyPrint<T>{
    public void println(T str){
        System.out.println((T)str);
        }
}

