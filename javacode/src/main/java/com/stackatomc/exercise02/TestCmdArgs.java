package com.stackatomc.exercise02;

/**
 * @Description: 控制台对args数组赋值，注意String类型可更改为其他类型
 * @User: Mayer
 * @Date: 2018/7/15 20:28
 * @Version: 1.0
 */
public class TestCmdArgs {

    /* 编译时容易出现乱码问题，强制加上编码参数-encoding，javac -encoding utf8 TestCmdArgs.java 即可*/
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            System.out.println("第"+i+"个参数: "+args[i]);
        }
    }
}/* Output:
> \exercise02>javac -encoding utf8 TestCmdArgs.java -d H:\gitProjects\javacode\src\classes
>  src\classes>java TestCmdArgs "Hello" "World"
第0个参数: Hello
第1个参数: World
*/
