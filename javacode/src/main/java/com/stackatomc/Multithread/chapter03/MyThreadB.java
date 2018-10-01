package com.stackatomc.Multithread.chapter03;

import java.io.PipedInputStream;

/**
 * @author MayerFang
 * @file MyThreadB
 * @Description
 * @date 2018/10/1
 */
public class MyThreadB extends Thread {

    private ReadData readData;
    private PipedInputStream input;
    public MyThreadB(ReadData readData,PipedInputStream input){
        this.readData=readData;
        this.input=input;
    }
    public void run(){
        readData.readMethod(input);
    }
}
