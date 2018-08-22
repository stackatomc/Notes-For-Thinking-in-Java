package com.stackatomc.tools;

import java.io.*;

/**
 * @author MayerFang
 * @file StoringAndRecoveringData
 * @Description
 * @date 2018/8/22
 */
public class StoringAndRecoveringData {

    public static void main(String[] args) throws IOException{
        DataOutputStream out=new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("H:\\Test\\a3.txt")
                )
        );
        //DataOutputStream 将各种数据类型以二进制形式输出，用户无法方便的进行查看
        //会出现乱码，建议用PrintWriter
        out.writeDouble(3.14159);
        out.writeUTF("That was pi");
        out.writeDouble(1.41413);
        out.writeUTF("Square root of 2");
        out.close();

        DataInputStream in=new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("H:\\Test\\a3.txt")
                )
        );
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());

    }
}
