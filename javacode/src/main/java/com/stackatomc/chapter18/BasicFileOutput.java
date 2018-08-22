package com.stackatomc.chapter18;

import java.io.*;

/**
 * @author MayerFang
 * @file BasicFileOutput
 * @Description 用PrintWriter的out 方法写入文件
 * @date 2018/8/22
 */
public class BasicFileOutput {

    static String file="H:\\Test\\a2.out";

    public static void main(String[] args)throws IOException {
        BufferedReader in=new BufferedReader(
                new StringReader(
                        BufferedInputFile.read("H:\\Test\\a2.txt")
                )
        );
        //Java SE5后添加了辅助构造器 直接用PrintWriter out=new PrintWriter(file);也使用了缓存实现
        PrintWriter out=new PrintWriter(
                new BufferedWriter(new FileWriter(file))
        );
        int lineCount=1;
        String s;
        while((s=in.readLine())!=null){
            // out是写入文件 PrintWriter不单可以输出到控制台，也可以写入文件
            out.println(lineCount++ +"："+s);
        }
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
