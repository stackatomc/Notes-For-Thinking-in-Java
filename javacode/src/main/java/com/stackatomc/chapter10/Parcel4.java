package com.stackatomc.chapter10;

/**
 * @author MayerFang
 * @file Parcel4
 * @Description
 * @date 2018/10/15
 */
interface Destination{
    String readLabel();
}
interface Contents{
    int value();
}



public class Parcel4 {

    public static void main(String[] args) {
        Parcel p=new Parcel();
        Contents c=p.contents();
        System.out.println(c.value());
        Destination d=p.destination("Tasmania");
        System.out.println(d.readLabel());
//        Parcel.PDestination d1=p.new PDestination("Tasmania");
//        p.new PContents();
    }
}

class Parcel{
    private class PContents implements Contents{
        private int i=11;
        @Override
        public int value(){return i;}
    }

    protected class PDestination implements Destination{
        private String label;
        private PDestination(String whereTo){
            label=whereTo;
        }
        @Override
        public String readLabel(){
            return label;
        }
    }

    public Destination destination(String s){
        return new PDestination(s);
    }
    public Contents contents(){
        return new PContents();
    }
}