package chapter21;

/**
 * @author MayerFang
 * @file ImpThread.java
 * @Description 继承Thread实现多线程
 * @date 2018/8/14
 */
public class ImpThread extends Thread {

    int i=1;

    public void run(){
        try{
            for(int i=0;i<5;++i){
                sleep(100);
                System.out.println(i);}
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        try{
            ImpThread ir=new ImpThread();
            ir.start();
            Thread.sleep(100);
            System.out.println("this");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
