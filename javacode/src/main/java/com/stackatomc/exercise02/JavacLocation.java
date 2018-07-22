package com.stackatomc.exercise02;

/**
 * @Description: 使用javac 和java 编译和运行
 * @User: stackc
 * @Date: 2018/7/15 19:36
 * @Version: 1.0
 *
 * @Details:
 * 1. 通常class编译后的文件会放在src/classes中，第一步手动创建该文件夹
 * 2.使用javac. javac H:/javacode/src/com/.../JavacLocation.java -d H:/javacode/src/classes
 * 3.在包名根目录位置 java 包名.类名 [参数可选 参数间空格隔开]
 * 如此处class文件刚编译后放在src/classes/com/stackc/... 所以在src/classes中执行java运行命令
 *
 */
public class JavacLocation {


    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
