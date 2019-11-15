package com.atguigu.java2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 *
 * 创建线程的方式四：使用线程池
 *
 * 好处：
 *      1.提高响应速度（减少了创建线程的时间）
 *      2.降低资源消耗（重复利用线程池中的线程，不需要每次都创建）
 *      3.便于管理
 *
 *
 *
 *
 *    面试题：创建多线程有几种方式？ 四种
 *
 * @Author zfj
 * @create 2019/10/28 11:27
 */
class NumberThread implements Runnable{

    public void run() {
        for(int i=0;i<=100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
class NumberThread1 implements Runnable{

    public void run() {
        for(int i=0;i<=100;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}


public class ThreadPool {
    public static void main(String[] args) {
        //1.提供指定数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1=(ThreadPoolExecutor)executorService;

        //设置线程池的属性
        //System.out.println(executorService.getClass());
        //service1.setCorePoolSize(15);
        //service1.setKeepAliveTime(10000);

        //2。执行指定的线程的操作。需要提供实现runnable接口或callable几口实现类的对象
        executorService.execute(new NumberThread());//适合使用runnable
        executorService.execute(new NumberThread1());//适合使用runnable
       // executorService.submit();//适合使用callable

        executorService.shutdown();

    }
}
