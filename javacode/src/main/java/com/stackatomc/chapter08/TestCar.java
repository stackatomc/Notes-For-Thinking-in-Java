package com.stackatomc.chapter08;

/**
 * @File: TestCar
 * @Description:
 * @Author: MayerFang
 * @Date: 2018/8/18 20:38
 * @Version: 1.0
 */
public class TestCar {

    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.run();
        //!animal.eat();
        Cat cat=(Cat)animal;
        cat.eat();
        cat.run();
    }

}

class Animal{

    public void run(){}
}

class Cat extends Animal{

    @Override
    public void run(){
        System.out.println("run override");
    }

    public void eat(){
        System.out.println("eat new");
    }
}

