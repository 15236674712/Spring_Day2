package com.baizhi.test;

import com.baizhi.dynamicporxy.AccountServiceImpl;
import com.baizhi.dynamicporxy.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory1 {

    @Test
    //测试动态代理
    public   void  TestSpring2(){
        //获取Spring的工厂
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取代理类的对象   通过原始类的ID 获取代理类的对象
        UserService userService=(UserService)ac.getBean("userService");
        userService.register();
        userService.register("小黑");
        userService.register("张三","123456");
    }
    @Test
    //测试动态代理
    public   void  TestSpring3(){
        //获取Spring的工厂
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取代理类的对象   通过原始类的ID 获取代理类的对象
        AccountServiceImpl accountService=(AccountServiceImpl) ac.getBean("accountService");
        accountService.register("小花");
    }

    @Test
    //测试动态代理
    public   void  TestSpring4(){
        //获取Spring的工厂
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        com.baizhi.test.UserService userService=(com.baizhi.test.UserService)ac.getBean("userService2");
        userService.register("小黑");

    }
}
