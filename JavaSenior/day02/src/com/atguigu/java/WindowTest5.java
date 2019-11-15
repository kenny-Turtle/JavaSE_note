package com.atguigu.java;

/**
 *
 * 使用同步方法来处理继承thread类的线程安全问题
 *
 * @Author zfj
 * @create 2019/10/27 14:07
 */
class wmT5 extends Thread{
    private static int ticket=100;
    public void run() {
        while(true){
            show();
        }
    }

    private static synchronized void show(){//现在的锁唯一了： 谁呢，是 wmT5
        //private synchronized void show(){//此种线程解决方式是错误的， 原因为 锁，这里的锁不唯一，所以要改成静态的
        if(ticket>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"----->>票号:"+ticket);
            ticket--;
        }
    }

}
public class WindowTest5 {
    public static void main(String[] args) {
        wmT5 t1=new wmT5();
        wmT5 t2=new wmT5();
        wmT5 t3=new wmT5();
        t1.setName("票台一");
        t2.setName("票台二");
        t3.setName("票台三");
        t1.start();
        t2.start();
        t3.start();
    }
}
