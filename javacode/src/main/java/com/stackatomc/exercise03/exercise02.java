package com.stackatomc.exercise03;

/**
 * @Description: 别名机制和实例对象指向，改变A对B是否产生影响
 * @User: Mayer
 * @Date: 2018/7/21 19:00
 * @Version: 1.0
 *
 * @Notes
 * 1 普通内部类不能直接实例化,需要通过外部实例才能初始化
 *  外部实例都未存在，普通内部类无法存在
 *  （可采用 exercise02.Tank tank1= new exercise02().new Tank(); 或采用外部类/静态内部类方式）
 * 2 测试别名机制A.i=B.i后是否修改A同时影响B，结论是不影响
 * 3 测试对类实例A=B引用时修改A将同时作用于B,不推荐，容易导致操作对象内的域混乱
 * 4 //! 注释掉的语句表示错误的用法(这种注释语法使得注释能够被自动移除以方便测试)
 */
public class exercise02 {

    /* 1 该普通内部类必须通过外部类才能进行实例化 */
//！    class Tank{
//        float f1;
//        float f2;
//    }


    public static void main(String[] args) {

        /*
        * 1 普通内部类不能直接实例化,需要通过外部实例才能初始化
        *  外部实例都未存在，普通内部类无法存在
        * */
        Tank tank1= new Tank();
        // 1 exercise02.Tank tank1= new exercise02().new Tank(); 这种可以,或采用外部类/静态内部类方式
        Tank tank2= new Tank();
        tank1.f1=11;
        tank2.f2=22;
        System.out.println("===Initial===");
        if(tank1==tank2){
            System.out.println("tank1 == tank2 ");
        }else{
            System.out.println("tank1 != tank2 ");
        }

        /* 2 测试别名机制A.i=B.i后是否修改A同时影响B，结论是不影响 */
        System.out.println("===tank1.f2=tank2.f2;===");
        tank1.f2=tank2.f2;
        if(tank1.f2==tank2.f2){
            System.out.println("tank1.f2 == tank2.f2");
        }else{
            System.out.println("tank1.f2 != tank2.f2 ");
        }


        //tank1.f1=tank2.f1;
        System.out.println(tank1.f1);
        System.out.println(tank2.f1);
        tank1.f1=4;
        System.out.println(tank1.f1);
        System.out.println(tank2.f1);

        /* 3 测试对类实例A=B引用时修改A将同时作用于B,不推荐，容易导致操作对象内的域混乱 */
        System.out.println("===tank1=tank2;===");
        tank1=tank2;
        if(tank1==tank2){
            System.out.println("tank1 == tank2 ");
        }else{
            System.out.println("tank1 != tank2 ");
        }
        if(tank1.f2==tank2.f2){
            System.out.println("tank1.f2 == tank2.f2");
        }else{
            System.out.println("tank1.f2 != tank2.f2 ");
        }

        //tank1=tank2;
        System.out.println(tank1.f1);
        System.out.println(tank2.f1);
        tank1.f1=4;
        System.out.println(tank1.f1);
        System.out.println(tank2.f1);

    }
    static class Tank{
        float f1;
        float f2;
    }
}




