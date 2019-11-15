package com.atguigu.java1;

/**
 * @Author zfj
 * @create 2019/10/27 15:08
 */
class A{
    public synchronized void foo(B b){
        System.out.println("当前线程名："+ Thread.currentThread().getName()+"进入了A实例的foo方法");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程名："+Thread.currentThread().getName()+"企图调用B实例的last方法");
        b.last();
    }
    public synchronized void last(){
        System.out.println("进入A类的last方法内部。");
    }
}
class B{
    public synchronized void foo(A a){
        System.out.println("当前线程名："+Thread.currentThread().getName()+"进入了B的实例的foo方法");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程名："+Thread.currentThread().getName()+"企图调用A实例的last方法");
        a.last();
    }
    public synchronized void last(){
        System.out.println("进入B类的last方法内部");
    }

}
public class DeadLock  implements Runnable{
    A a=new A();
    B b=new B();

    public static void main(String[] args) {
        DeadLock dl=new DeadLock();
        new Thread(dl).start();
        dl.init();
    }
    public void init(){
        Thread.currentThread().setName("主线程");
        a.foo(b);
        System.out.println("进入了主线程之后");
    }
    public void run() {
        Thread.currentThread().setName("副线程");
        b.foo(a);
        System.out.println("进入了副线程之后");
    }

}
