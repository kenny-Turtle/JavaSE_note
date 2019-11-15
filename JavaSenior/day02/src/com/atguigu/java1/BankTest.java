package com.atguigu.java1;

/**
 *
 * 使用同步机制将单例模式中的懒汉式写成线程安全的
 *
 * @Author zfj
 * @create 2019/10/27 14:19
 */
public class BankTest {
}

//懒汉式
class Bank{

    private Bank(){}

    private static Bank instance=null;

    //用同步方法 的方式，加个synchronized关键字就行了
    //private static synchronized Bank getInstance(){//此时 线程已经安全，其中的锁 是Bank.class ，（因为前面有static）
    private static Bank getInstance(){

        //方式一
//        synchronized (Bank.class) { //此方法和上面的效果一样，但是！！！效率较差
//            if(instance==null){
//                instance=new Bank();
//            }
//            return instance;
//        }
        //方式二
        if(instance==null){
            synchronized (Bank.class){
                if(instance==null){
                    instance=new Bank();
                }
            }
        }
        return instance;
    }

}
