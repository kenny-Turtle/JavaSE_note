package com.zfj.singleton;

/**
 * @Author zfj
 * @create 2019/11/23 19:12
 * 枚举单例，可以有效的解决反射破坏单例的问题
 * 线程安全，调用效率高，不能延时加载
 */
public enum  SingletonDemo06 {
    INSTANCE;
    public SingletonDemo06 getInstance(){
        return INSTANCE;
    }
}
class SingletonDemo06Test{
    public static void main(String[] args) {
        SingletonDemo06 instance = SingletonDemo06.INSTANCE;
        SingletonDemo06 instance2 = SingletonDemo06.INSTANCE;
        System.out.println(instance==instance2);
    }
}
