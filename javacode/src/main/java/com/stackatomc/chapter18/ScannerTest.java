package chapter18;
import java.util.Scanner;

/**
 * @author MayerFang
 * @file ScannerTest.java
 * @Description Scanner类的基本使用
 * @date 2018/8/13
 * 1. scanner类有判断类型，有获取指定类型。
 *  可能经常需要涉及抛出异常，比如不匹配类型等
 */
public class ScannerTest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //1. scanner类有判断类型，有获取指定类型
        while(sc.hasNextInt()){
            int i=sc.nextInt();
        }
    }
}
