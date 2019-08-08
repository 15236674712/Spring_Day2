package com.baizhi.anotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 该注解应用在方法上
@Target(ElementType.METHOD)
/*
指定注解的生命周期  RetentionPolicy.CLASS  在字节码文件中生效\
                  RetentionPolicy.SOURCE 在.java文件中生效、
                  RetentionPolicy.RUNTIME 运行时依然有效
**/
@Retention(RetentionPolicy.RUNTIME)
public @interface KG {
    String value()  default "小黑"  ;
}
