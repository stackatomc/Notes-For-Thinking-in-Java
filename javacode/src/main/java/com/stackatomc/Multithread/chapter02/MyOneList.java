package com.stackatomc.Multithread.chapter02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MayerFang
 * @file MyOneList
 * @Description
 * @date 2018/9/28
 */
public class MyOneList {
    private List list=new ArrayList();
    synchronized public void add(String data){
        list.add(data);
    }
    synchronized public int getSize(){
        return list.size();
    }

}
