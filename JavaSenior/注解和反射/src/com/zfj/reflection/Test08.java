package com.zfj.reflection;

import com.sun.org.apache.bcel.internal.generic.MethodGen;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author zfj
 * @create 2019/11/23 11:27
 */
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("com.zfj.reflection.User");
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());

        //获得类的属性
        Field[] fields = c1.getFields();
        fields=c1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);

        }
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            System.out.println(method);

        }
    }
}
