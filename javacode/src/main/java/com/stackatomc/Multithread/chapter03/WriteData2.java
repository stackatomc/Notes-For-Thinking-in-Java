package com.stackatomc.Multithread.chapter03;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * @author MayerFang
 * @file WriteData2
 * @Description
 * @date 2018/10/1
 */
public class WriteData2 {

    public void writeMethod2(PipedWriter out){
        try{
            System.out.println("write:");
            for(int i=0;i<300;++i){
                String outData=""+(i+i);
                out.write(outData);
                System.out.println(outData);
            }
            System.out.println();
            out.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
