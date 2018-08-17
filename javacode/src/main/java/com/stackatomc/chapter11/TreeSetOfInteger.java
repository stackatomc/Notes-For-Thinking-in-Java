package chapter11;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Set;
/*
 * @Description TreeSet支持红黑树原理进行排序
 * @author MayerFang
 *
 * @Notes
 * SortedSet<Integer> intest=new TreeSet<Integer>();
 * String.CASE_INSENSITIVE_ORDER改变默认按字典序排列ABab为按字母序排列AaBb
 **/
public class TreeSetOfInteger {

    public static void main(String[] args) {
        Random rand=new Random(100);
        SortedSet<Integer> intest=new TreeSet<Integer>();
        Set<String> words=new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);//String.CASE_INSENSITIVE_ORDER改变默认按字典序排列ABab为按字母序排列AaBb
        for(int i=0;i<10000;++i){
            intest.add(rand.nextInt(30));
        }
        System.out.println(intest);
    }
}
