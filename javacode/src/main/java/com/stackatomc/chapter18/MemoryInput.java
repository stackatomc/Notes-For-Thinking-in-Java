package com.stackatomc.chapter18;

import java.io.IOException;
import java.io.StringReader;

/**
 * @author MayerFang
 * @file MemoryInput
 * @Description StringReader 读取文件按字节流输出 int char
 * @date 2018/8/21
 */
public class MemoryInput {

    public static void main(String[] args)throws IOException {
        StringReader in=new StringReader(
                BufferedInputFile.read("H:\\Test\\a2.txt")
        );
        int c;
        while((c=in.read())!=-1){
            System.out.print((char)c);
        }
    }
}
