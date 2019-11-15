package atguigu.java;

/**
 * 多线程的创建， 方式一：继承Thread类
 *  1，创建一个继承与Thread类的子类
 *  2，重写Thread类的run()方法  -->将此线程执行的操作声明在run方法中
 *  3，创建Thread类的子类对象
 *  4，通过此对象调用start方法
 *
 *  例子：遍历100以内的所有偶数
 *
 * @Author zfj
 * @create 2019/10/25 13:59
 */

class MyThread extends Thread{
    public void run() {
        for(int i=0;i<=100;i++){
            System.out.println(i);
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();


        //问题二，再启动一个线程
        MyThread t2 = new MyThread();
        t2.start();

        for(int i=0;i<=100;i++){
            System.out.println(i+"*");
        }
    }
}
