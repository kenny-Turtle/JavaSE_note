package com.zfj.reflection;

import java.net.SocketTimeoutException;

/**
 * @Author zfj
 * @create 2019/11/23 11:16
 */
public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        //获取系统类加载器的父类加载器----》拓展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);
        //获取拓展类加载器的父类加载器---根加载器
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        ClassLoader classLoader = Class.forName("com.zfj.reflection.Test07").getClassLoader();
        System.out.println(classLoader);
        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1);

    }
}
