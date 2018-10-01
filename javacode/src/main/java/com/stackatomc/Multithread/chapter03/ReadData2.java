package com.stackatomc.Multithread.chapter03;

import java.io.PipedReader;

/**
 * @author MayerFang
 * @file ReadData2
 * @Description
 * @date 2018/10/1
 */
public class ReadData2 {

    public void readMethod2(PipedReader input){

        try{
            System.out.println("read:");
            char[] charArray=new char[20];
            int charLength=input.read(charArray);
            while(charLength!=-1){
                String newData=new String(charArray,0,charLength);
                System.out.println("newData="+newData);
                charLength=input.read(charArray);
            }
            System.out.println();
            input.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
