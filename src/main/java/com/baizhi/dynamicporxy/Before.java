package com.baizhi.dynamicporxy;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Before implements MethodBeforeAdvice {

    /*
    * 书写额外功能代码    该方法在原始方法之前执行
    * 方法作用:  在原始方法之前执行额外额外功能
    * 参数作用：
    *           method:  原始方法  的方法对象
    *           args:   给对应的原始方法 添加的实参
    *           target:  添加给的原始方法所在的类  创建的对象
    *
    *
    *
    *
    *
    *
    * */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        //获取原始方法的名字
        //System.out.println("方法名"+method.getName());
        //遍历
        /*for (Object arg : args) {
            System.out.println("参数"+arg);
        }
        */
        //System.out.println("类型"+target.getClass());
        System.out.println("------原始方法运行之前执行---------");
    }
}
