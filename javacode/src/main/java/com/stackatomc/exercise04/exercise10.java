package com.stackatomc.exercise04;

/**
 * @Description:
 * @User: Mayer
 * @Date: 2018/7/22 20:07
 * @Version: 1.0
 */
public class exercise10
{
    public int twoMult(int a,int b){
        return a+b*10;
    }
    public int fourMult(int a,int b,int c,int d){
        return a+b*10+c*100+d*1000;
    }

    public void keeptry(int a,int b,int c,int d){
        int result=fourMult(a,b,d,c);
        if(twoMult(a,b)*twoMult(c,d)==result){
            System.out.println(a+""+b+" * "+c+""+d+" = "+result);
        }
    }

    public static void main(String[] args) {
        exercise10 multTest=new exercise10();
        for(int i=1;i<10;++i){
            for(int j=0;j<10;++j){
                for(int k=1;k<10;++k){
                    for(int l=0;l<10;l++){
                        multTest.keeptry(i,j,k,l);
                    }
                }
            }
        }
    }
}

