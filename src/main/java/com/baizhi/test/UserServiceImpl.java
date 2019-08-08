package com.baizhi.test;

//原始类
public class UserServiceImpl implements UserService {
    @Override
    public void register() {
         //核心功能
        System.out.println("我是UserServiceImpl类中的注册方法");
    }

    @Override
    public int register(String username) {
        //核心功能
        System.out.println("我是UserServiceImpl类带有一个参数的注册方法");
        throw  new  RuntimeException("我是异常 嘻嘻");
        //return  888;
    }

    @Override
    public void register(String username, String password) {
         //核心功能
        System.out.println("我是USerServiceImpl中带有两个参数的注册方法");
    }


}