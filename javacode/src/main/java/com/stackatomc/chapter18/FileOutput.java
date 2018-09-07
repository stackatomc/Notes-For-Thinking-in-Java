package chapter18;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.File;


/**
 * @author MayerFang
 * @file ${FILE}
 * @Description
 * @date 2018/8/13
 * @Notes
 *
 * 1.FileOutputStream 可写入数据
 * 2.注意不同步骤的异常，精确异常
 * 3. public void write(int w)throws IOException{}
 * 4. public void write(int w)throws IOException{}
 */
public class FileOutput {
    /*
    * 1.FileOutputStream 可写入数据
    * 2.注意不同步骤的异常，精确异常
    * 3. public void write(int w)throws IOException{}
    * 4. public void write(int w)throws IOException{}
    * */
    public static void main(String[] args) throws FileNotFoundException{
        File f=new File("D:/workspace");
        OutputStream out=new FileOutputStream(f);//需要抛出FileNotFoundException异常
    }
}
