package com.stackatomc.tools;

import java.io.*;

/**
 * @author MayerFang
 * @file SaveObject
 * @Description readResolve()方法解决多线程中序列和反序列问题
 * @date 2018/10/2
 */
public class SaveObject {



    public static void main(String[] args) {

        try{

            MyFile file= MyFile.getInstance();
            FileOutputStream fosRef=new FileOutputStream(new File("myObjectFile.txt"));
            ObjectOutputStream oosRef=new ObjectOutputStream(fosRef);
            oosRef.writeObject(file);
            oosRef.close();
            fosRef.close();
            System.out.println(file.hashCode());

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

        try{
            FileInputStream flsRef=new FileInputStream(new File("myObjectFile.txt"));
            ObjectInputStream losRef=new ObjectInputStream(flsRef);
            MyFile file=(MyFile)losRef.readObject();
            losRef.close();
            flsRef.close();
            System.out.println(file.hashCode());
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }



}

class MyFile implements Serializable{

    private static final long serialVersionID=888L;

    private MyFile(){}

    static class MyFileHandler{
        private static MyFile m=new MyFile();
    }

    public static MyFile getInstance(){
        return MyFileHandler.m;
    }

    // 一般来说，一个类实现了 Serializable接口，我们就可以把它往内存地写再从内存里读出而"组装"成一个跟原来一模一样的对象。不过当序列化遇到单例时，里边就有了个问题：从内存读出而组装的对象破坏了单例的规则。单例是要求一个JVM中只有一个类对象的，而现在通过反序列，一个新的对象克隆了出来。
    protected Object readResolve() throws ObjectStreamException{
        System.out.println("Resolve");
        return MyFileHandler.m;
    }
}