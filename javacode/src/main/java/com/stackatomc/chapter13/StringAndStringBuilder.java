package chapter13;

/**
 * @author MayerFang
 * @file StringAndStringBuilder.java
 * @Description 对比String和StringBuilder添加字符串操作性能
 * @date 2018/8/14
 */
public class StringAndStringBuilder {

    public static void main(String[] args) {

    }
    public String StringOper(String[] strlist){
        String str1="";
        for(int i=0;i<strlist.length;++i){
            str1=str1+strlist[i];
        }
        return str1;
    }
    public String StringBuilderOper(String[] strlist){
        StringBuilder str2=new StringBuilder();
        for(int i=0;i<strlist.length;++i){
            str2.append(strlist[i]);
        }
        return str2.toString();
    }
}
