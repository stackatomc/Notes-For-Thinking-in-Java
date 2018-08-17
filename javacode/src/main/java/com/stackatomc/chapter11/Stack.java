package chapter11;
import java.util.LinkedList;
/*
 * @Description 通过LinkedList自定义Stack数据结构操作
 * @author MayerFang
 *
 * @Notes
 * 1. 包括push/peek/pop/empty方法
 * */
public class Stack<T>{

    private LinkedList<T> storage=new LinkedList<T>();
    public void push(T v){storage.addFirst(v);}
    public T peek(){return storage.getFirst();}
    public T pop(){return storage.removeFirst();}
    public boolean empty(){ return storage.isEmpty();}
    public String toString(){return storage.toString();}
}
