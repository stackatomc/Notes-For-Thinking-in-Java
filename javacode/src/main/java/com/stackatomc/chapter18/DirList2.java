//package chapter18;
//
//import java.io.File;
//import java.io.FilenameFilter;
//import java.util.Arrays;
//import java.util.regex.Pattern;
//        /*
//* @Description 1. 在文件获传输过过程中，加入目录过滤器(使用匿名类实现，程序变小，但不推荐不便于阅读)
//* 2. 匿名内部类实现
//*
//* * @author MayerFang
//**/
//
//public class DirList2{
//
//    public static void main(String[] args) {
//        File path=new File(".");
//        String[] list;
//        if(args.length==0){
//            list=path.list();
//        }
//        else{
//            list=path.list(new FilenameFilter(){
//                private Pattern pattern=Pattern.compile(args[0]);
//                public boolean accept(File dir,String name){
//                    return pattern.matcher(name).matches();
//                }
//            });
//            Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
//            for(String dirItem:list) System.out.println(dirItem);
//        }
//    }
//}
