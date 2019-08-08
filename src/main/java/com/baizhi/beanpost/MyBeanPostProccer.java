package com.baizhi.beanpost;

import com.baizhi.entity.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProccer  implements BeanPostProcessor {
    /*
    * 调用初始化方法之前 调用
    * 参数：
    *    o：代表创建的对象
    *    s: bean中的id值
    *
    *    返回值：把加工过后的对象 返回
    *
    *
    * */
    //第一个方法不做处理
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return  o;
    }

    /*
     * 调用初始化方法之后 调用
     * 参数：
     *    o：代表创建的对象
     *    s: bean中的id值
     *    返回值：把加工过后的对象 返回
     * */

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        if (o instanceof User){
            User user=(User)o;
            user.setId(2);
            user.setUsername("小三");
            //把改造过后的user返回
            return user;
        }else{
            return  o;
        }
    }
}
