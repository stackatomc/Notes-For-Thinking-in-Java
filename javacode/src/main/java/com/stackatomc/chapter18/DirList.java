package chapter18;
import java.io.File;
import java.util.regex.Pattern;
import java.io.FilenameFilter;
import java.util.Arrays;
/*
* @Description 1. 在文件获传输过过程中，加入目录过滤器
* 2. 非内部类实现，
*
* * @author MayerFang
**/



public class DirList
{
    public static void main(String[] args) {
        File path=new File(".");
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

/* 使用到策略模式 */
class DirFilter implements FilenameFilter{
    private Pattern pattern;
    public DirFilter(String regex){
        pattern=Pattern.compile(regex);
    }
    public boolean accept(File dir,String name){
        return pattern.matcher(name).matches(); //matcher()整个匹配到才为true
    }
}
