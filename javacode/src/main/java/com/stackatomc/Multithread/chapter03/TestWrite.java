package com.stackatomc.Multithread.chapter03;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author MayerFang
 * @file TestWrite
 * @Description
 * @date 2018/10/1
 */
public class TestWrite {



    public static void main(String[] args) {
        WriteData writeData=new WriteData();
        ReadData readData=new ReadData();
        PipedInputStream p1=new PipedInputStream();
        PipedOutputStream p2=new PipedOutputStream();



        try{
            p2.connect(p1);
        }catch(Exception e){
            e.printStackTrace();
        }

        MyThreadA threadA=new MyThreadA(writeData,p2);
        threadA.start();


        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        MyThreadB threadB=new MyThreadB(readData,p1);
        threadB.start();
    }
}
