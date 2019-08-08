package com.baizhi.staticporxy;

//代理类
public class LandProxyServiceImpl implements  LandService {
    @Override
    public void land() {
        //额外功能
        System.out.println("打广告");
        System.out.println("看房子");
        //调用房东的租房方法
        LandService ls=  new  LandServiceImpl();
        ls.land();
    }
}
