package com.baizhi.dynamicporxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Around  implements MethodInterceptor {

    /*
     *
     *  方法作用: 运行在原始方法之前后执行
     *
     * 参数作用：
     *     MethodInvocation  原始方法的封装
     *
     * 返回值：
     *     原始方法的返回值
     *
     * */

    @Override
    public Object invoke(MethodInvocation  mi) throws Throwable {
        System.out.println("原始方法执行之前执行");
        //原始方法的执行  ret代表原始方法的返回值
        Object ret = mi.proceed();
        System.out.println("原始方法执行之后执行");
        System.out.println("方法的返回值"+ret);
        return  ret;
    }
}
