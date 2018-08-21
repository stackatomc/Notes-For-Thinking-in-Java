package chapter21;

/**
 * @author MayerFang
 * @file ImpRun.java
 * @Description 实现Runnable接口实现多线程
 * @date 2018/8/14
 */
public class ImpRun implements Runnable {

    int i=1;

    public void run(){
        try{
            for(int i=0;i<10;++i){
            Thread.sleep(1000);
            i=i+1;
            System.out.println(i);}
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        try{ for(int i=0;i<10;++i){
            ImpRun ir=new ImpRun();
            ir.run();
            Thread.sleep(20);
            System.out.println("this");}
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
