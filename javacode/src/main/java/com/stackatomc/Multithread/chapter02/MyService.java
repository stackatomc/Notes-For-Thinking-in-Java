package com.stackatomc.Multithread.chapter02;

/**
 * @author MayerFang
 * @file MyService
 * @Description
 * @date 2018/9/28
 */
public class MyService {

    public MyOneList addServiceMethod(MyOneList list,String data) {
        try {

            if (list.getSize() < 1) {
                //这里可能AB都进来到这里了
                Thread.sleep(2000);
                list.add(data);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return list;
    }
}
