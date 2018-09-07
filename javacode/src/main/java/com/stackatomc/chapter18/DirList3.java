package com.stackatomc.chapter18;

import java.io.File;

import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author MayerFang
 * @file DirList3
 * @Description
 * @date 2018/8/21
 */
public class DirList3 {

    public static void main(String[] args){
        File path=new File("H:\\Test");
        String[] list;
        if(args.length==0){
            list=path.list();
        }else{
            list=path.list(new DirFilter(args[0]));
        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for(String dirItem:list){
            System.out.println(dirItem);
        }
    }
}

class DirFilter implements FilenameFilter{
    private Pattern pattern;

    public DirFilter(String regex){
        pattern=Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }

}