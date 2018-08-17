package chapter11;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;

/*
* @Description Queue和PriorityQueue的用法
* @author MayerFang
* @Notes
*1. Iterator是一个轻量级对象，创建它的代价比较小，单项移动，可以获取下一个元素/是否还有元素/删除最新返回的元素等
*2 Queue 是某种类似限制了LinkedList的方法
*3. PriorityQueue 是先进先出的策略
**/

public class QueueTest {

    public static void main(String[] args) {
        /* 2 Queue 是某种类似限制了LinkedList的方法 */
        Queue<Integer> queue=new LinkedList<Integer>();
        for(int i=0;i<10;++i){
            queue.offer(i);//offer()方法是将一个元素插入到队尾
        }
        /* 3 PriorityQueue 是先进先出的策略 */
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<Integer>();
        for(int i=0;i<10;++i){
            queue.offer(i);//PriorityQueue 是先进先出的策略，offer默认插入时会被排序
        }
    }
}
