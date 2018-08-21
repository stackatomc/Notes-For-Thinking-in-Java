package com.stackatomc.tools;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * @author MayerFang
 * @file FormattedMemoryInput
 * @Description 使用DataInputStream 面向字节读取输出 文件内容
 * @date 2018/8/21
 */
public class FormattedMemoryInput {

    public static void main(String[] args)throws IOException {
        try{
            DataInputStream in=new DataInputStream(
                    new ByteArrayInputStream(
                            BufferedInputFile.read("H:\\Test\\a2.txt").getBytes()
                    )
            );
            while(in.available()!=0)
                System.out.print((char)in.readByte());
        }catch(EOFException e){
            e.printStackTrace();
        }
    }
}
