package com.stackatomc.Multithread.chapter05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author MayerFang
 * @file Run1
 * @Description Timer定时器的使用
 * @date 2018/10/1
 */
public class Run1 {

    private static Timer timer=new Timer(true);

    static public class MyTask extends TimerTask{
        @Override
        public void run(){
            System.out.println("运行了，时间为："+new Date());
        }
    }



    public static void main(String[] args) {
        try{
            MyTask task=new MyTask();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
            String dateString="2018-10-01 22:43:00";
            Date dateRef=sdf.parse(dateString);
            System.out.println(dateRef);
            System.out.println("字符串时间:"+dateString+"    当前时间:"+new Date().toLocaleString());
            timer.schedule(task,dateRef);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
