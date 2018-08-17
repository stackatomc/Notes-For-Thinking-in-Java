package chapter11;
import java.util.*;
/*
 * @Title Collection_And_Iterator
 * @Description Collection和Iterator作为参数类型向上转型的使用
 * @author MayerFang
 *
 * @Notes
 * 1 容器之间的所有共性都是通过迭代器达成的
 * 2 Collection做参 比起Iterator优于可以使用foreach
 * 3. 用集合类Collections的方法直接指定序列和赋值
 * 思考：这种是否更灵活，通过Collection接口向上转型
 * */
public class Collection_And_Iterator {

    /* 1 容器之间的所有共性都是通过迭代器达成的 */
    public static void display(Iterator<String> iterator){
        while(iterator.hasNext()){
            String strparent=iterator.next();
            System.out.print(strparent);
        }
    }

    /* 2 Collection做参 比起Iterator优于可以使用foreach */
    public static void display(Collection<String> colls){
        for(String str: colls){
            System.out.print(str);
        }
        System.out.println();
    }

    public static void main(String[] args) {
            List<String> strList=new ArrayList<String>();
            Set<String> strSet=new HashSet<String>(strList);
            Collections.addAll(strList,"s1 s2 s3".split(" "));
            Collections.addAll(strSet,"s1 s2 s3 s1".split(" "));

            /* 1 容器之间的所有共性都是通过迭代器达成的 */
            display(strList.iterator());
            /* 2 比起Iterator优于可以使用foreach */
            display(strList);
    }
}
