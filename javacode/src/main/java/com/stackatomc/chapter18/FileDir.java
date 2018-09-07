package chapter18;
import java.io.File;

/**
 * @author MayerFang
 * @file FileDir.java
 * @Description File目录和文件的常用操作，创建目录，文件遍历，list等区别
 * @date 2018/8/13
 * @Notes
 * 1.mkdirs() 创建目录
 * 2.遍历输出目录，涉及目录/文件的判断
 * 3.list()和listFiles()
 */
public class FileDir {
    public static void main(String[] args) {
        //1.mkdirs() 创建目录
        String filepath = "haha";
        File newf = new File(filepath);
        newf.mkdirs();//可以迭代创建目录

//        //2.遍历输出目录，涉及目录/文件的判断
        File newf2 = new File(filepath);
//        if(newf2.isDirectory()){
//            System.out.println("目录："+newf2);
//            String[] newf3=newf2.list();
//            for(int i=0;i<newf3.length;++i){
//                File newf4=new File(newf3[i]);
//                if(newf4.isDirectory()){
//                    System.out.println(newf3[i]+":是一个目录");
//                }else{
//                    System.out.println(newf3[i]+":是一个文件");
//                }
//            }
//        }else{
//            System.out.println(newf2+"：不是一个目录");
//        }


        //3.list()和listFiles()
        String[] datlist = newf2.list();
        File[] fillist = newf2.listFiles();//带绝对路径
    }
}
