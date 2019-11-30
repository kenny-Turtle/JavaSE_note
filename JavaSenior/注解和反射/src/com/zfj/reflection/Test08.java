package com.zfj.reflection;

import com.sun.org.apache.bcel.internal.generic.MethodGen;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author zfj
 * @create 2019/11/23 11:27
 */
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.zfj.reflection.User");
        System.out.println(c1.getName());//活得类的名字
        System.out.println(c1.getSimpleName());//获得类的简单名字

        //获得类的属性
        Field[] fields = c1.getFields();//只能找到public属性
        fields=c1.getDeclaredFields(); //找到全部的属性
        for (Field field : fields) {
            System.out.println(field);
        }
        //获得指定属性的值
        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        //获得类的方法
        Method[] methods = c1.getMethods();//获得本类及其父类的所有方法
        for (Method method : methods) {
            System.out.println(method);
        }
        methods=c1.getDeclaredMethods();//获得本类的所有方法
        for (Method method : methods) {
            System.out.println(method);
        }

        //获得指定的方法
        //重载
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        Method setAge = c1.getMethod("setAge", int.class);
        System.out.println(getName);
        System.out.println(setName);
        System.out.println(setAge);

        //获得构造器
        System.out.println("---------------------------------------------");
        Constructor[] constructors = c1.getConstructors();
        System.out.println(constructors);
        for (Constructor constructor : constructors) {//获得public的构造器
            System.out.println("aaaaa "+constructor);
        }
        constructors=c1.getDeclaredConstructors();
        for (Constructor constructor : constructors) {//获得所有构造器
            System.out.println("bbbbb "+constructor);
        }
        System.out.println("=======================================");
        //获得指定构造器
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println("指定："+declaredConstructor);
    }
}
