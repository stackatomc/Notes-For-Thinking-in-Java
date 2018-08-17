package chapter11;
import java.util.ArrayList;
/*
* @Description JavaSE 5 容器类型是否指定的区别
* @author MayerFang
*
* @Notes
* 1. 这里是默认自增的实现
* //! 2. gerbilArrayList.add(new Orange()); 出错，类型不正确，属于运行时报错
* 3. 指定类型,则会改变为编译时报错
* */
class Gerbil{

    //1. 这里是默认自增的实现
    public static long init = 0;
    private final long gerbilNumber =  init ++ ;
    public void hop() {
        System.out.println(gerbilNumber + "：我正在调用");
    }

}

class Orange{}

public class GerbilTest{
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList gerbilArrayList=new ArrayList();
        int i=0;
        for(i=0;i<3;++i){
            gerbilArrayList.add(new Gerbil());
        }

        //! 2. gerbilArrayList.add(new Orange()); 出错，类型不正确，属于运行时报错
        for(i=0;i<gerbilArrayList.size();++i){
            ((Gerbil)(gerbilArrayList.get(i))).hop();
        }

        //3. 指定类型,则会改变为编译时报错
        // 并且该可用泛型或者是向上转型支持所有子类
        // ArrayList<Gerbil> gerbilArrayList=new ArrayList<Gerbil>();

    }

}