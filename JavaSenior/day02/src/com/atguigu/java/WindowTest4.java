package com.atguigu.java;

/**
 * 使用同步方法解决runnable接口的线程安全问题
 *
 *  关于同步方法的总结：
 *  1.同步方法任然涉及到同步监视器，只是不需要我们显示的声明。
 *  2.非静态的同步方法，同步监视器是： this
 *    静态的同步方法，同步监视器是：当前类本身
 *
 * @Author zfj
 * @create 2019/10/27 13:50
 */
class mwT4 implements Runnable{
    private int ticket=100;
    public void run() {
        while(true){
            show();
        }
    }
    private synchronized void show(){  //同步监视器：this
        //synchronized(this){
            if(ticket>0){

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+"--->>票号："+ticket);
                ticket--;
            }
        //}
    }
}
public class WindowTest4 {
    public static void main(String[] args) {
        mwT4 m4=new mwT4();
        Thread t1=new Thread(m4);
        Thread t2=new Thread(m4);
        Thread t3=new Thread(m4);
        t1.setName("票台一");
        t2.setName("票台二");
        t3.setName("票台三");
        t1.start();
        t2.start();
        t3.start();
    }
}
