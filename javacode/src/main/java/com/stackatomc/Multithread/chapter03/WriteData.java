package com.stackatomc.Multithread.chapter03;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author MayerFang
 * @file WriteData
 * @Description
 * @date 2018/10/1
 */
class WriteData {

    public void writeMethod(PipedOutputStream out){
        try{
            System.out.println("write:");
            for(int i=0;i<300;++i){
                String outData=""+(i+1);
                out.write(outData.getBytes());
                System.out.println(outData);
            }
            System.out.println();
            out.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
