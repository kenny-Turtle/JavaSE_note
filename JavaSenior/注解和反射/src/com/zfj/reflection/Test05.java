package com.zfj.reflection;

/**
 * @Author zfj
 * @create 2019/11/23 10:13
 */
public class Test05 {
    public static void main(String[] args) {
        AA a=new AA();
        System.out.println(a.m);
    }


}
class AA{
    static{
        System.out.println("A类的静态代码块初始化");
        m=300;
    }
    static int m=100;
    public AA(){
        System.out.println("A类的无参构造初始化。");
    }
}
