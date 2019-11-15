package com.atguigu.java;

/**
 * 例子：创建三个窗口卖票，总票数为100张   使用runnable接口的方法
 *
 *
 * 1. 问题：卖票过程中，出现里错票，重票  --》出现里线程的安全问题
 * 2. 问题出现的原因：当某个线程操作车票的过程中，尚未完成操作，其他线程参与进来，也操作车票
 * 3. 如何解决：当一个线程在操作ticket时，其他线程不能参与进来。知道线程a操作完ticket时，其他线程才可以开始操作ticket
 *             即使线程a出现里阻塞，那也要等线程a结束。
 * 4. 在Java中，我们通过同步机制，来解决线程的安全问题。
 *
 *      方式一：同步代码块
 *
 *          synchronized(同步监视器){
 *              //需要被同步的代码
 *          }
 *          说明：1 .（什么叫需要被同步的代码） 操作共享数据的代码，  --》包含的代码，不能多也不能少
 *               2 .共享数据：多个线程共同操作的变量。比如：ticket 就是共享数据
 *               3 .同步监视器，俗称：锁。任何一个类的对象，都可以来充当锁
 *                   要求：多个线程必须要公用同一把锁。
 *
 *                  补充：在实现runnable接口创建多线程的方式中，我们可以考虑使用this来充当同步监视器（锁）
 *
 *      方式二：同步方法
 *
 *          如果操作共享数据的代码完整的声明在一个方法中，我们可以将此方法声明同步
 *
 * 5.同步的方式，解决了线程的安全问题。-------好处
 *      操作同步代码时，只能由一个线程参与，其他线程等待。相当于一个单线程，效率低。--------坏处
 *
 * @Author zfj
 * @create 2019/10/26 13:41
 */
class mWindow2 implements Runnable{

    private  int ticket=100;
    Object obj=new Object();
    public void run() {
        while(true){
            synchronized(obj){
            if(ticket>0){

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+";票号："+ticket);
                ticket--;
            }else
                break;
        }
        }
    }
}

public class WindowTest2 {
    public static void main(String[] args) {
        mWindow2 mw2=new mWindow2();
        Thread t1=new Thread(mw2);
        Thread t2=new Thread(mw2);
        Thread t3=new Thread(mw2);

        t1.setName("票台1");
        t2.setName("票台2");
        t3.setName("票台3");
        t1.start();
        t2.start();
        t3.start();
    }
}
