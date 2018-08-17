package chapter11;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;
import java.util.Collections;
/*
 * @Description HashSet与contains使用
 * @author MayerFang
 *
 * @Notes
 * Set<Integer> intest=new HashSet<Integer>();
 * set1.remove(1);//注意这里remove是传入Object对象，不是index下标
 **/
public class HashSetOfInteger {

    public static void main(String[] args) {
        Random rand=new Random(47);//最美47数字
        Set<Integer> intest=new HashSet<Integer>();
        for(int i=0;i<10000;++i){
            intest.add(rand.nextInt(30));
        }

        Set<String> set1=new HashSet<String>();
        Collections.addAll(set1,"A B C D E F G H".split(" "));
        //主要优化了归操作，contains()搭配使用
        System.out.println("set1.contains('A'):"+set1.contains("A"));
        System.out.println(set1);
        set1.remove("A");
        set1.remove(1);//注意这里remove是传入Object对象，不是index下标
        System.out.println(set1.size());
        System.out.println(set1);
    }
}
