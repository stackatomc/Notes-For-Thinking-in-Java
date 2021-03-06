package com.stackatomc.chapter07;

/**
 * @Description: 组合 车、轮子、窗
 * @Author: mayer
 * @Date: 2018/8/18 19:12
 * @Version: 1.0
 * @Notes：
 * Car car=new Car();
 * car.left.window.rolldown();//组合就是可以将其他类组合起来，作为一个类的属性，被一个类使用
 * car.wheel[0].inflate(72);
 */

class Engine{
    public void start(){}
    public void stop(){}
}

class Wheel{
    public void inflate(int psi){}
}

class Window{
    public void rollup(){}
    public void rolldown(){}
}

class Door{
    public Window window=new Window();
}

public class Car {

    public Engine engine=new Engine();
    public Wheel[] wheel=new Wheel[4];
    public Door left=new Door();
    public Door right=new Door();

    public Car(){
        for(int i=0;i<4;i++){
            wheel[i]=new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car=new Car();
        car.left.window.rolldown();//组合就是可以将其他类组合起来，作为一个类的属性，被一个类使用
        car.wheel[0].inflate(72);
    }


}
