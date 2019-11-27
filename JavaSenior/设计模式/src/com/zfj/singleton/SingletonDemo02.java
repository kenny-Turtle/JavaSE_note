package com.zfj.singleton;

/**
 * @Author zfj
 * @create 2019/11/23 18:13
 * 单例模式----懒汉式
 * 线程安全，调用效率不高，可以延时加载
 */
public class SingletonDemo02 {
    //1、私有化
    private SingletonDemo02(){
    }
    //2、类初始化
    private static SingletonDemo02 instance;
    //3、提供一个方法对外开放
    public static synchronized SingletonDemo02 getInstance(){
        if(instance==null){
            instance=new SingletonDemo02();
        }
        return instance;
    }
}
class SingletonDemo02Test{
    public static void main(String[] args) {
        SingletonDemo02 instance = SingletonDemo02.getInstance();
        SingletonDemo02 instance2 = SingletonDemo02.getInstance();
        System.out.println(instance==instance2);
    }
}
