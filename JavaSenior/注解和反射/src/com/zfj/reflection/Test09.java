package com.zfj.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author zfj
 * @create 2019/11/23 11:41
 * 动态创建对象，通过反射的方式
 */
public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获得class对象
        Class c1 = Class.forName("com.zfj.reflection.User");

        //构造一个对象
        User user = (User)c1.newInstance();//本质上时调用了类的无参构造
        System.out.println(user);

        //通过构造器创建对象
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user2 = (User) constructor.newInstance("zs", 001, 12);
        System.out.println(user2);

        //通过反射调用普通方法
        User user3 = (User) c1.newInstance();
        //通过反射获得一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        //invoke激活的意思（对象，方法的值）
        setName.invoke(user3,"zhu");
        System.out.println(user3.getName());

        //通过反射操作属性,第一次运行发现有错误，但是name是私有属性不能直接操作，故我们可以关闭它的权限检测
        User user4 = (User) c1.newInstance();
        Field name = c1.getDeclaredField("name");
        name.setAccessible(true);//关闭安全检测
        name.set(user4,"小朱");
        System.out.println(user4.getName());



    }
}
