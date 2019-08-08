package com.baizhi.staticporxy;

public class UserProxyServiceImpl  implements  UserService {
    @Override
    public void register() {
        //额外功能
        System.out.println("------事务888-------");
        //调用核心功能
        UserService userService=new UserServiceImpl();
        userService.register();
    }

    @Override
    public void delete() {
        //额外功能
        System.out.println("------事务888-------");
        //调用核心功能
        UserService userService=new UserServiceImpl();
        userService.delete();
    }

    @Override
    public void update() {
        //额外功能
        System.out.println("------事务888-------");
        //调用核心功能
        UserService userService=new UserServiceImpl();
        userService.update();
    }
}
