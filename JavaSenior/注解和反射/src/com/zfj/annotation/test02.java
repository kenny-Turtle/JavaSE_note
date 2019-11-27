package com.zfj.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author zfj
 * @create 2019/11/21 15:39
 */
public class test02 {
    //注解可以显式赋值，如果没有默认值，我们必须给注解赋值
    @Myannotation2(name = "小张")
    public void test2(){}
    @Myannotation3("小朱")
    public void test3(){}
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Myannotation2{
    //注解的参数：参数类型+参数名();
    String name() default "";
    int age() default 0;
    int id() default -1;//如果默认值为-1，代表不存在

    String[] schools() default {"sss","aaaa"};
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Myannotation3{
    String value();
}








