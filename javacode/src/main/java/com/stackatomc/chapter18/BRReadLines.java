package chapter18;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author MayerFang
 * @file BRReadLines.java
 * @Description BufferedReader缓存的 br.readLine() 方法
 * @date 2018/8/13
 */
public class BRReadLines {

    public static void main(String[] args)throws IOException {
        System.out.println("请输入词组，以'end'确认结束：");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;
        do{
           str=br.readLine();//回车一行执行一行
           System.out.println(str);
        }while(!str.equals("end"));
    }
}
