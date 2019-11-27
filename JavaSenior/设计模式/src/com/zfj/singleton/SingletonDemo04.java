package com.zfj.singleton;

import java.lang.reflect.Constructor;

/**
 * @Author zfj
 * @create 2019/11/23 18:27
 *
 * 静态内部类实现
 *
 */
public class SingletonDemo04 {
    private SingletonDemo04(){

    }
    private static class InnerClass{
        private static final SingletonDemo04 instance=new SingletonDemo04();
    }
    public static SingletonDemo04 getInstance(){
        return InnerClass.instance;
    }
}
//看似完美，但是，使用反射，可以无视private关键字,故 可以破坏以上的单例
class SingletonDemo04Test{
    public static void main(String[] args) throws Exception {
        SingletonDemo04 instance = SingletonDemo04.getInstance();

        Constructor<SingletonDemo04> declaredConstructor = SingletonDemo04.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        SingletonDemo04 instance2 = declaredConstructor.newInstance();
        System.out.println(instance==instance2);
    }
}
