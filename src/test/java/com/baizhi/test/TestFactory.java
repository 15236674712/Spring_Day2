package com.baizhi.test;

import com.baizhi.entity.Product;
import com.baizhi.staticporxy.UserProxyServiceImpl;
import com.baizhi.staticporxy.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {

    @Test
    public   void   TestSpring(){
        //创建工厂
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        // User user=(User) ac.getBean("user");
        Product product=(Product) ac.getBean("product");
        System.out.println(product);
    }

    @Test
    //测试静态代理
    public   void   TestSpring1(){
        //LandService ls= new LandProxyServiceImpl();
        //调用代理的租房方法
        //ls.land();
        UserService userService=new UserProxyServiceImpl();
        userService.update();
    }


}
