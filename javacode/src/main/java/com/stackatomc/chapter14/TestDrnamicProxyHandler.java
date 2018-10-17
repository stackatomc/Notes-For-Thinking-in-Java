package com.stackatomc.chapter14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author MayerFang
 * @file TestDrnamicProxyHandler
 * @Description
 * @date 2018/10/17
 */

interface iPrintWord{
    void printhh();
    void printStr(String str);
}

class PrintWorder implements iPrintWord{

    @Override
    public void printhh() {
        System.out.println("PrintWorder is printing: hh ");
    }

    @Override
    public void printStr(String str) {
        System.out.println("PrintWorder is printing: "+str);
    }
}

class DynamicProxyHandler implements InvocationHandler{

    private Object proxied;

    public DynamicProxyHandler(Object proxied){
        this.proxied=proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("***proxy:"+proxy.getClass().getName()+"*** method:"+method);
        System.out.print("***args:  ");
        if(args!=null){
            for(Object arg:args){
                System.out.print(arg+"  ");
            }
        }else System.out.print(args+"   ");
        Object obj=method.invoke(proxied,args);
        while(obj!=null){
            obj=method.invoke(proxied,args);
        }
//        if(method.getName().equals("printStr"))return null;
        System.out.println("hhhend");
        return obj;
    }
}


public class TestDrnamicProxyHandler {

    public static void consumer(iPrintWord iface){
        iface.printhh();
        iface.printStr("printWhat???");
    }

    public static void main(String[] args) {
        PrintWorder printWorker=new PrintWorder();
        iPrintWord iproxy=(iPrintWord) Proxy.newProxyInstance(
                iPrintWord.class.getClassLoader(),new Class[]{iPrintWord.class},
                new DynamicProxyHandler(printWorker)
        );
        consumer(iproxy);
    }
}
