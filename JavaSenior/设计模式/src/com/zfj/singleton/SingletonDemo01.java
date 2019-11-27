package com.zfj.singleton;

/**
 * @Author zfj
 * @create 2019/11/23 18:06
 * 单例模式----饿汉式
 * 线程安全，调用效率高，不能延时加载
 */
public class SingletonDemo01 {
    //1、私有化构造器
    private SingletonDemo01(){
    }
    //2、类初始化的时候，立即加载该对象
    private static SingletonDemo01 instance=new SingletonDemo01();
    //3、提供获取该对象的方法，没有synchronization的效率高
    public static SingletonDemo01 getInstance(){
        return instance;
    }
}
class SingletonDemo01Test{
public static void main(String[]args){
    SingletonDemo01 instance = SingletonDemo01.getInstance();
    SingletonDemo01 instance2 = SingletonDemo01.getInstance();

    System.out.println(instance==instance2);
}
}
