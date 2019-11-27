package com.zfj.reflection;

/**
 * @Author zfj
 * @create 2019/11/23 10:57
 */
public class Test06 {
    static{
        System.out.println("main类被加载");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        //1,主动引用
//        Son son=new Son();

        //反射也会产生主动引用
//        Class.forName("com.zfj.reflection.Son");

        //2,不会产生类的引用的方法
//        System.out.println(Son.b);
        System.out.println(Son.M);
    }
}
class Father{
    static int b=2;
    static{
        System.out.println("父类被加载");
    }
}
class Son extends Father{
    static{
        System.out.println("子类被加载");
        m=100;
    }
    static int m=300;
    static final int M=1;
}
