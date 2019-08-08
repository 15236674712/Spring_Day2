package com.baizhi.dynamicporxy;

import com.baizhi.anotation.KG;

public class AccountServiceImpl {
    @KG
    public   void   register(String  username){
        System.out.println("我是AccountServiceImpl类中的注册方法");
    }

}
