package com.stackatomc.chapter18;

import java.io.File;
import java.io.IOException;

/**
 * @author MayerFang
 * @file MakeDirectories
 * @Description
 * @date 2018/8/21
 */
public class MakeDirectories {

    /*
    * 1. 提示文件操作功能
    * 2. 打印文件相关信息
    * 3. 删除文件/文件夹
    * 4. 改名文件/文件夹
    * 5. 创建文件（文件夹要用mkdirs()/mkdir()）
    * */
    public static void warnMsg(){
        System.out.println("" +
                "1. Creating new file: path\n" +
                "2. Rename file：-r path oldname newname\n" +
                "3. Delete file：-d path");
    }

    public static void fileData(File file){
        System.out.println("Absolutory："+file.getAbsolutePath());
        System.out.println("Can read："+file.canRead());
        System.out.println("Can write："+file.canWrite());
        System.out.println("getName："+file.getName());
        System.out.println("getParent："+file.getParent());
        System.out.println("getPath："+file.getPath());
        System.out.println("length："+file.length());
        System.out.println("lastModified："+file.lastModified());
    }

    public static void fileManager(String... args){
        warnMsg();
        File oldfile,newfile;
        if(args[0].equals("-r")){
            //System.out.println("RENAME FILE");
            oldfile=new File(args[1]);
            newfile=new File(args[2]);
            oldfile.renameTo(newfile);
            fileData(oldfile);
            fileData(newfile);
        }else if(args[0].equals("-d")){
            oldfile=new File(args[1]);
            if(!oldfile.exists()) System.out.println("not exists");
            else {
                fileData(oldfile);
                oldfile.delete();
                System.out.println("deleted file success");
            }
        }else{
            newfile=new File(args[0]);

            if(!newfile.exists()) {
                try{
                newfile.createNewFile();
                }catch(IOException e){e.printStackTrace();}
                System.out.println("create file success");
            }else {
                System.out.println("not exists");
            }
        }
    }

    public static void main(String[] args) {
        fileManager(args);
    }
}
