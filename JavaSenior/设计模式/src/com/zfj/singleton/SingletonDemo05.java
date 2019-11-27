package com.zfj.singleton;

import java.lang.reflect.Constructor;

/**
 * @Author zfj
 * @create 2019/11/23 18:52
 * 优化 ：
 * 用懒汉式，但是为了防止反射机制破坏单例，我们在私有化的时候，在里面加上同步锁判断其instance是否唯一
 * 优点：静态内部类式（线程安全，调用效率高，可以延时加载）
 * 缺点，会被反射破坏
 */
public class SingletonDemo05 {
    //最终优化
    private static boolean flag=false;
    private SingletonDemo05(){
        if(flag==false){
            flag=true;
        }else
            throw new RuntimeException("不要试图用反射来破坏单例");
    }
    //此方法可以避免正常创建实例和反射创建实例，但如果是两个类都是用反射创建，任然会破坏掉我们的单例
    /*private SingletonDemo05(){
        synchronized (SingletonDemo05.class) {
            if(instance!=null){
                throw new RuntimeException("不要试图用反射来破坏单例");
            }
        }
    }*/
    private static SingletonDemo05 instance;
    public static SingletonDemo05 getInstance(){
        if(instance==null){
            synchronized (SingletonDemo05.class){
                if(instance==null)
                    instance=new SingletonDemo05();
            }
        }
        return instance;
    }
}
class SingletonDemo05Test{
    public static void main(String[] args) throws Exception{
//        SingletonDemo05 instance = SingletonDemo05.getInstance();
//        SingletonDemo05 instance2 = SingletonDemo05.getInstance();
//        System.out.println(instance==instance2);

        Constructor<SingletonDemo05> declaredConstructor = SingletonDemo05.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        SingletonDemo05 instance = declaredConstructor.newInstance();
        SingletonDemo05 instance2 = declaredConstructor.newInstance();
        System.out.println(instance==instance2);

    }
}
