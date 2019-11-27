package com.zfj.singleton;

/**
 * @Author zfj
 * @create 2019/11/23 18:19
 *
 * DCL懒汉式
 * （由于jvm底层内部模型的原因，偶尔会出现问题，不建议使用
 *
 */
public class SingletonDemo03 {
    //1、私有
    private SingletonDemo03(){}
    //2、类初始化的时候，不立即加载该对象
    private static SingletonDemo03 instance;
    //3、对外开放
    public static SingletonDemo03 getInstance(){
        if(instance==null){
            synchronized(SingletonDemo03.class){
                if(instance==null)
                    instance=new SingletonDemo03();
            }
        }
        return instance;
    }
}
class SingletonDemo03Test{
    public static void main(String[] args) {
        SingletonDemo03 instance = SingletonDemo03.getInstance();
        SingletonDemo03 instance1 = SingletonDemo03.getInstance();
        System.out.println(instance==instance1);
    }
}
