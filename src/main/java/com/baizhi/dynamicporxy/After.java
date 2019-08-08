package com.baizhi.dynamicporxy;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class After  implements AfterReturningAdvice {
    /*
     * 方法作用: 运行在原始方法之后执行
     * 参数作用:
     *          ret  代表原始方法的返回值
     *          method: 原始方法的对象
     *          args: 原始方法传入的实际参数
     *          target: 原始方法所在的类 创建的对象
     * */
    @Override
    public void afterReturning(Object ret, Method method, Object[] args, Object  target) throws Throwable {
      /*  System.out.println("返回值"+ret);
        System.out.println("方法名"+method.getName());
        for (Object arg : args) {
            System.out.println("传入的实参"+arg);
        }
        System.out.println(target.getClass());*/
        System.out.println("原始方法执行之后执行的额外功能");
    }
}
