package com.zfj.reflection;

/**
 * @Author zfj
 * @create 2019/11/21 16:43
 */
public class cla {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.m);
    }
}

class A{
    static int m=100;
    static{
        System.out.println("A类静态代码块初始化");
        m=300;
    }

    public A(){
        System.out.println("A类的无参构造器初始化");
    }
}
