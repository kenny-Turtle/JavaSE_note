package com.zfj.annotation;

import java.lang.annotation.*;

/**
 * @Author zfj
 * @create 2019/11/21 15:13
 */
//什么式注解
@MyAnnotation
public class Test01 {
    public void test(){

    }


}
//定义一个注解
//Target 表示我们的注解可以用在哪些地方
@Target(value = {ElementType.METHOD,ElementType.TYPE})

//Retention 表示我们的注解在什么地方还有效。
//runtime>class>sources
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation{

}
