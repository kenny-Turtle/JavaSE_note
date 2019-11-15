package com.atguigu.java;

/**
 *
 * 使用同步代码块解决Thread类的方式的线程安全问题
 *
 * 说明：在继承Thread类创建多线程的方式中，慎用this来充当锁的方式，一定要考虑此this是不是唯一
 *
 * @Author zfj
 * @create 2019/10/26 18:43
 */
class mt3 extends Thread{
    private static int ticket=100;
    private static Object obj=new Object();
    public void run() {
        while(true){
            synchronized(obj){
                //或者synchronized(mt3.class){  因为这个类，只会加载一次，所有也可以充当锁
            if(ticket>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+":----->>票号："+ticket);
                ticket--;
            }else
                break;
            }
        }
    }
}
public class WindowTest3 {
    public static void main(String[] args) {
        mt3 mtt1 = new mt3();
        mt3 mtt2 = new mt3();
        mt3 mtt3 = new mt3();
        mtt1.setName("票台一");
        mtt2.setName("票台二");
        mtt3.setName("票台三");
        mtt1.start();
        mtt2.start();
        mtt3.start();
    }
}
