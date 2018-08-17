package chapter13;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * @author MayerFang
 * @file DateFormatTest.java
 * @Description
 * @date 2018/8/13
 * @Notes
 * 1.SimpleDateFormat E 周几 yyyy.MM.dd hh.mm.ss 注意指定其他文字用''单引号引起
 */

public class DateFormatTest {
    public static void main(String[] args) {
        Date today=new Date();
        System.out.println(today.toString());//格式：Mon Aug 13 16:16:54 CST 2018
        //1.SimpleDateFormat E 周几 yyyy.MM.dd hh.mm.ss 注意指定其他文字用''单引号引起
        SimpleDateFormat sdf=new SimpleDateFormat("E yyyy.MM.dd 'at' hh.mm.ss a");
        System.out.println(sdf.format(today));
    }
}
/* Output：
* Mon Aug 13 16:17:36 CST 2018
* 星期一 2018.08.13 at 04.17.36 下午
*/
