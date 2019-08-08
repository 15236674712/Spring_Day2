package com.baizhi.staticporxy;

//原始类
public class UserServiceImpl  implements  UserService {

    @Override
    //原始方法
    public void register() {
         //核心功能
        System.out.println("处理业务的逻辑代码");
        System.out.println("调用DAO");
    }

    @Override
    public void delete() {
        //核心功能
        System.out.println("处理业务的逻辑代码");
        System.out.println("调用删除DAO");
    }

    @Override
    public void update() {
        //核心功能
        System.out.println("处理业务的逻辑代码");
        System.out.println("调用修改DAO");
    }
}
