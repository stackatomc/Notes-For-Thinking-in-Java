package com.stackatomc.chapter05;

/**
 * @author MayerFang
 * @file EnumTest
 * @Description
 * @date 2018/10/23
 */
public class EnumTest {

    public static void main(String[] args) {

        // enum with one parameter by define its constructor;
        ColorEnum myColor=ColorEnum.BLUE;
        System.out.println(myColor.getColorNum());

        ColorEnum yourColor=ColorEnum.getName(3);
        System.out.println(yourColor);

        // enum classical operation with switch
        EnumTest enumTest=new EnumTest(ColorEnum.BLUE);
        enumTest.switchAndEnum();



    }

    private ColorEnum herColorNum;

    public EnumTest(ColorEnum herColorNum){
        this.herColorNum=herColorNum;
    }

    public void switchAndEnum(){
        switch (herColorNum){
            case RED:
                System.out.println("your are hot!");
                break;
            case GREEN:
                System.out.println("poor guy");
                break;
            case BLUE:
                System.out.println("BLUE I like you");
                break;
            default:
                System.out.println("who are you, ERROR!!!");
                break;
        }
    }


}

enum ColorEnum{
    RED(1),GREEN(2),BLUE(3);

    private int ColorNum;
    ColorEnum(int ColorNum){
        this.ColorNum=ColorNum;
    }

    public void setColorNum(int ColorNum){
        this.ColorNum=ColorNum;
    }

    public int getColorNum(){
        return ColorNum;
    }

    public static ColorEnum getName(int ColorNum){
        for(ColorEnum colorEnum:values()){
            if(colorEnum.getColorNum()==ColorNum){
                return colorEnum;
            }
        }
        return null;
    }
}
