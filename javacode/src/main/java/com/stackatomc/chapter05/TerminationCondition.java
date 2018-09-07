package com.stackatomc.chapter05;

import java.awt.print.Book;
import java.io.IOException;

/**
 * @Description: 重写finalize()方法
 * @Author: Mayer
 * @Date: 2018/7/23 20:39
 * @Version: 1.0
 * @Notes
 * 1 通过重写protected void finalize() throws Throwable 方法，可用来验证终结条件是否执行，避免缺陷
 *  finalize()方法默认在垃圾回收执行前被调用，一个对象的finalize()方法只会被调用一次，而且finalize()被调用不意味着gc会立即回收该对象
 * 所以有可能调用finalize()后，该对象又不需要被回收了，然后到了真正要被回收的时候，因为前面调用过一次，所以不会调用finalize()，产生问题
 * 2 System.gc() 用于强制进行终结动作，若不声明，则通过重复执行程序面临内存耗尽的情景，迫使垃圾回收动作的执行，也能找出错误对象
 * 3-1 3-2 类似查看程序疏忽的 重写finalize() 还会发生在一个socket链接，在对象初始化时创建，整个生命周期内有效，那么就需要实现finalize，关闭这个链接。
 *  或者关闭文件等，注意使用super.finilize()通常情况 （2个实例如下）
 */

class BookInfo{

    boolean checkOut=false;

    BookInfo(boolean isRelease){
        this.checkOut=isRelease;
    }

    void checkIn(){
        checkOut=false;
    }

    @Override
    protected void finalize() throws Throwable {
        if(checkOut){
            System.out.println(this+":checkOut");
            super.finalize();
        }
    }

    /* 3-1 一般来说，finalize被作为第二种安全网来使用，如FileInputStream类，  */
//    protected void finalize() throws IOException {
//        if (fd != null) {
//            if (fd != fd.in) {
//                close();
//            }
//        }
//    }

//    /* 3-2 注意：某些用到finalize的地方，你必须像如下所示，显式调用回收链。*/
//    protected void finalize() throws IOException {
//        try{
//                              ...
//        }finally{
//            super.finalize();
//        }
//    }

}



public class TerminationCondition {

    public static void main(String[] args) throws Throwable {
       BookInfo novel1=new BookInfo(true);
       novel1.checkIn();
       new BookInfo(true);
       //System.gc(); // 用于强制进行终结动作，若不声明，则通过重复执行程序面临内存耗尽的情景，迫使垃圾回收动作的执行，也能找出错误对象
    }

}
