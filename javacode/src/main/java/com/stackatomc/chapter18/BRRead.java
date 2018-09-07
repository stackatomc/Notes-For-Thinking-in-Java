package chapter18;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author MayerFang
 * @file BRReadLines.java
 * @Description BufferedReader缓存的 br.read() 方法，为(char)
 * @date 2018/8/13
 */
public class BRRead {

    //1.能否在read()处try catch捕获更好，只有后面才报抛出
    //2. 默认用BufferedReader做输入
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入，按下'q'退出：");
        do{
            c=(char)br.read();// 要抛出异常IOException
            System.out.println(c);
        }while(c!='q');
    }
}
