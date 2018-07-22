package com.stackatomc.exercise03;

/**.
 * @Description: 使用Mathround(Math.random())模拟扔硬币
 * @User: stackc
 * @Date: 2018/7/21 19:38
 * @Version: 1.0
 *
 * @Notes
 * 1 第一句Random.nextInt(1)来源java.util.Random类中的方法(带种子);是普通方法不可直接通过类名调用
 * 2 Math.random()是Math类中的静态方法,使用渐变方便,(int)(Math.random()*10) 可对其强制类型转换为所需要对象
 * 3 参考中使用Random.nextBoolean();模拟扔硬币
 */

class coin{
    double front;
    double back;
        }

public class exercise07 {

    public static void main(String[] args) {

        coin coinTest=new coin();

        /* 1 第一句Random.nextInt(1)来源java.util.Random类中的方法(带种子);是普通方法不可直接通过类名调用*/
        //!coinTest.back=Random.nextInt(1);
        //Random random=new Random();
        //coinTest.back=random.nextInt();
        /* 2 Math.random()是Math类中的静态方法,使用渐变方便,(int)(Math.random()*10) 可对其强制类型转换为所需要对象 */
        coinTest.front= Math.round(Math.random());
        coinTest.back= Math.round(Math.random());
        if(coinTest.front==1&&coinTest.back==1){
            System.out.println("均为正面！");
        }else if ((coinTest.front==0&&coinTest.back==1)||(coinTest.front==1&&coinTest.back==0))
        {
            System.out.println("一正一反！");
        }else{
            System.out.println("均为反面！");
        }
        System.out.println("The results is : " );
        System.out.println("coinTest.front = "+ coinTest.front+
                "and coinTest.front ="+ coinTest.back);




    }

}
