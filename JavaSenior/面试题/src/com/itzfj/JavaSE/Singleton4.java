package com.itzfj.JavaSE;

/**
 * 1.构造器私有化
 * 2.用一个静态变量来保存这个唯一实例
 * 3.提供一个静态方法，获取这个实例对象
 * @Author zfj
 * @create 2019/11/13 12:16
 */
public class Singleton4 {
    private static Singleton4 instance;
    private Singleton4(){

    }
    public static Singleton4 getInstance(){
        synchronized (Singleton4.class){
            if(instance==null){

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                instance=new Singleton4();
            }
        }

        return instance;
    }
}
