package com.atguigu.java1;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * 解决线程安全问题的方式三： Lock锁--------JDK5.0新增
 *
 * 1.面试题：synchronized与Lock的异同？
 *      同：二者都可以解决线程的安全问题
 *      不同：synchronized机制在执行完相应的同步代码以后，自动的释放同步监视器
 *           Lock需要手动的启动同步，同事结束同步也需要手动实现
 *
 * 2.优先使用顺序：
 *      Lock----》同步代码块-----》同步方法
 *
 *
 * @Author zfj
 * @create 2019/10/27 15:21
 */
class Window implements Runnable{
    private int ticket =100;
    //1,实例化
    private ReentrantLock lock=new ReentrantLock();
    public void run() {
        while(true){
            try{
                //2调用lock方法
                lock.lock();
                if(ticket>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"---:票号:"+ticket);
                    ticket--;
                }else
                    break;
            }finally {
                //3.调用解锁的方法：unlock
                lock.unlock();
            }
        }
    }
}
public class LockTest {
    public static void main(String[] args) {
        Window w=new Window();
        Thread t1=new Thread(w);
        Thread t2=new Thread(w);
        Thread t3=new Thread(w);
        t1.setName("票台一");
        t2.setName("票台二");
        t3.setName("票台三");
        t1.start();
        t2.start();
        t3.start();

    }
}
