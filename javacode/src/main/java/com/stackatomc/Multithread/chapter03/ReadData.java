package com.stackatomc.Multithread.chapter03;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * @author MayerFang
 * @file ReadData
 * @Description
 * @date 2018/10/1
 */
public class ReadData {

    public void readMethod(PipedInputStream input){
        try{
            System.out.println("read:");
            byte[] byteArray=new byte[20];
            int readLength=input.read(byteArray);
            System.out.println("readLength="+readLength);
            while(readLength!=-1){
                String newData=new String(byteArray,0,readLength);
                System.out.println("newData="+newData);
                readLength=input.read(byteArray);
                System.out.println("readLength="+readLength);
            }
            System.out.println();
            input.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
