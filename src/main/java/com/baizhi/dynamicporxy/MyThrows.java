package com.baizhi.dynamicporxy;

import org.springframework.aop.ThrowsAdvice;

public class MyThrows  implements ThrowsAdvice {
    //覆盖 afterThrowing  方法
    public  void   afterThrowing(Exception e){
        System.out.println("我是异常时 添加的额外功能");
    }
}
