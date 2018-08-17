package chapter11;

import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;

import java.util.Collections;
/*
 * @Description Collection容器类实现
 * @author MayerFang
 *
 * @Notes
 * //1. 直接接口实现
 * //2. 赋值,Array.asList(对象) 序列方法addAll
 * //3. 用集合类Collections的方法直接指定序列和赋值
 * 思考：这种是否更灵活，通过Collection接口向上转型
 * */
public class AddingGroups {
    public static void main(String[] args) {
        //1. 直接接口实现
        Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

        //2. 赋值,Array.asList(对象) 序列方法addAll
        Integer[] moreInts={6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));

        //3. 用集合类Collections的方法直接指定序列和赋值
        Collections.addAll(collection,11,12,13,14,15);
    }
}
