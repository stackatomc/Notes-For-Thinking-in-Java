package chapter18;
import java.io.File;

/**
 * @author MayerFang
 * @file ${FILE}
 * @Description
 * @date 2018/8/13
 */
public class BLDirTest {
    public static void main(String[] args) {
        String filepath="F:";
        File file=new File(filepath);

        double minfsize=file.length();
        double maxfsize=file.length();
        String minf=file.toString();
        String maxf=file.toString();

        File[] files=file.listFiles();
        for(File f:files){
            if(f.length()<minfsize){
                minfsize=f.length();
                minf=f.toString();
            }
            if(f.length()>maxfsize){
                maxfsize=f.length();
                maxf=f.toString();
            }
        }
        System.out.println("minfsize："+minfsize+"("+minf+")");
        System.out.println("maxfsize："+maxfsize+"("+maxf+")");
    }
}
