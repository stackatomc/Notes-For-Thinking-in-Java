package chapter18;
import jdk.internal.util.xml.impl.Input;

import java.io.*;

/**
 * @author MayerFang
 * @file fileStreamTest.java
 * @Description 有关文件的InputStream/OutputStream/FileInputStream/FileOutputSteam 对文件进行写入和读取
 * @date 2018/8/13
 * @Notes
 * 1. write() 可以byte[] 输入，也可以foreach遍历输入
 * 2. in都取出来需要遍历输出
 * 3. 注意异常抛出
 */
public class fileStreamTest {

    public static void main(String[] args) {
        try{
        File filepath=new File("fileStream.txt");
        OutputStream out=new FileOutputStream(filepath);
        byte[] Wcontents={11,21,31,41,51};
        //1. write() 可以byte[] 输入，也可以foreach遍历输入
//        for(byte b:Wcontents){
//            out.write(b);
//        }
        out.write(Wcontents);
        //out.close();

        InputStream in=new FileInputStream(filepath);

        //System.out.println("in.available()"+in.available());
        //2. in都取出来需要遍历输出
        for(int i=0;i<in.available();i++){
            System.out.println(in.read());
        }

        in.close();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
