package com.stackatomc.chapter06.Relative;

/* 2 注意这里，要具体到类名或者使用* */
//! import com.stackatomc.chapter06;
import com.stackatomc.chapter06.GrandParent;
import javafx.scene.Parent;

/**
 * @Description: 验证同包与import的使用
 * @Author: stackc
 * @Date: 2018/7/25 19:12
 * @Version: 1.0
 * @Notes：
 * 1 package com.stackatomc.chapter06.Relative 和 om.stackatomc.chapter06属于两个包
 * 这里注意default是不能被这种方式访问到的
 * 2 注意这里，要具体到类名或者使用*
 *  //! import com.stackatomc.chapter06;
 * */

public class Child {

    /*
    * 1 package com.stackatomc.chapter06.Relative 和 om.stackatomc.chapter06属于两个包
    * 这里注意default是不能被这种方式访问到的
    * */
    // ! Parent hallo=new Parent();
    GrandParent grandParent=new GrandParent();


}
