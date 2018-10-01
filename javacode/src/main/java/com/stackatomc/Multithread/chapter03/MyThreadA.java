package com.stackatomc.Multithread.chapter03;

import java.io.PipedOutputStream;

/**
 * @author MayerFang
 * @file MyThreadA
 * @Description
 * @date 2018/10/1
 */
public class MyThreadA extends Thread {

    private WriteData writeData;
    private PipedOutputStream out;
    public MyThreadA(WriteData writeData,PipedOutputStream out){
        super();
        this.writeData=writeData;
        this.out=out;
    }
    public void run(){
        writeData.writeMethod(out);
    }
}
