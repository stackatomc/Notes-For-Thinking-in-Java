//package chapter18;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.File;
//import java.io.OutputStreamWriter;
//import java.io.InputStreamReader;
//import java.io.FileInputStream;
//
///**
// * @author MayerFang
// * @file fileWriter.java
// * @Description OutputStreamWriter和InputStreamReader做文件读取和写入
// * @date 2018/8/13
// * @Notes
// * 1. OutputStreamWriter/InputStreamReader指定文件编码
// */
//public class fileWriter {
//    public static void main(String[] args)throws IOException {
//
//        File f=new File("fileWriter.txt");
//        FileOutputStream fos=new FileOutputStream(f);
//        //1. OutputStreamWriter字节流通向字符流的桥梁,带缓存
//        //2. 可以指定编码,默认为操作系统默认编码,windows上是gbk
//        OutputStreamWriter writer=new OutputStreamWriter(fos,"UTF-8");
//
//        writer.append("中文输入：");
//
//        writer.append("\r\n");
//
//        writer.close();
//
//        fos.close();
//
//        FileInputStream fis=new FileInputStream(f);
//        InputStreamReader reader=new InputStreamReader(fis,"UTF-8");
//
//        StringBuffer sb=new StringBuffer();
//        while(reader.ready()){
//            sb.append((char)reader.read());
//        }
//        System.out.println("文件读取为："+sb.toString());
//        reader.close();
//
//        //3. 注意关闭每个打开的对象
//        fis.close();
//    }
//}
