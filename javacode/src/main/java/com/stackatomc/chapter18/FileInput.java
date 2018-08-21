package chapter18;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;

/**
 * @author MayerFang
 * @file ${FILE}
 * @Description
 * @date 2018/8/13
 * @Notes
 *
 * 1.InputStream out = new FileInputStream(File对象指定文件路径); FileInputStream 读取文件
 * 2.public void close() throws IOException{}
 * 关闭此文件输入流并释放与此流有关的所有系统资源。抛出IOException异常。
 * 3.protected void finalize()throws IOException {}
 * 这个方法清除与该文件的连接。确保在不再引用文件输入流时调用其 close 方法。抛出IOException异常。
 * 4. public int read(int r)throws IOException{}
 * 这个方法从 InputStream 对象读取指定字节的数据。返回为整数值。返回下一字节数据，如果已经到结尾则返回-1。
 */

public class FileInput {

    /**
     * 1.InputStream out = new FileInputStream(File对象指定文件路径); FileInputStream 读取文件
     * 2.public void close() throws IOException{}
     * 关闭此文件输入流并释放与此流有关的所有系统资源。抛出IOException异常。
     * 3.protected void finalize()throws IOException {}
     * 这个方法清除与该文件的连接。确保在不再引用文件输入流时调用其 close 方法。抛出IOException异常。
     * 4. public int read(int r)throws IOException{}
     * 这个方法从 InputStream 对象读取指定字节的数据。返回为整数值。返回下一字节数据，如果已经到结尾则返回-1。
     */
    //1. 注意一个/和结尾无/
    public static void main(String[] args) throws IOException {
        File f =new File("D:/workspace");
        InputStream in = new FileInputStream(f);
    }

}
