package com.stackatomc.chapter04;

/**
 * @Description: break和continue搭配标签跳出指定循环的使用
 * @User: stackc
 * @Date: 2018/7/22 20:25
 * @Version: 1.0
 * @Notes
 * Outer:
 * ...
 *      Inner:
 *          continue Outer; //从Inner跳出，到Outer处执行Outer下一轮循环
 *          break Outer; //从Inner跳出，Outer处跳出Outer循环不再执行
 */
public class LeabledWhile {

    public static void main(String[] args) {
        int i = 0;
        Outer:
        for (; true; ) {
            Inner:
            for (; i < 5; i++) {
                System.out.println("i:" + i);
                if (i == 1) {
                    System.out.println("continue");
                    i++;
                    continue Outer;
                }
                if (i == 2) {
                    System.out.println("break");
                    i++;
                    break Outer;
                }
            }
        }
    }
}/*Output:
i:0
i:1
continue
i:2
break
*/
