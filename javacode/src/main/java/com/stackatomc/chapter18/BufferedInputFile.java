package com.stackatomc.chapter18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author MayerFang
 * @file BufferedInputFile
 * @Description 实现将文件内容以字符流方式读取到文件中
 * @date 2018/8/21
 */
public class BufferedInputFile {

    /*
    * BufferedReader readLine()
    * 实现将文件内容以字符流方式读取到文件中
    * */

    public static String read(String filepath)throws IOException{
        BufferedReader in=new BufferedReader(
                new FileReader(filepath)
        );
        String s;
        StringBuilder str=new StringBuilder();
        while((s=in.readLine())!=null){
            str.append(s+"\n");
        }
        in.close();
        return str.toString();
    }

    public static void main(String[] args)throws IOException {
        System.out.println(read("H:\\Test\\a2.txt"));
    }
}
