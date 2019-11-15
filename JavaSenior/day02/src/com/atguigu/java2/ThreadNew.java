package com.atguigu.java2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *
 * 创建线程的方式三：实现callable接口。--------JDK5.0
 *
 *
 * 如何理解实现callable接口的方式创建多线程比实现runnable接口创建多线程方式强大？
 * 1.call可以有返回值
 * 2.call可以抛出异常，被外面的操作捕获，获取异常信息
 * 3.callable是支持泛型的
 *
 * @Author zfj
 * @create 2019/10/28 10:55
 */
//1.创建一个实现callable接口的实现类
class NumThread implements Callable{
    //2.实现call方法，将此线程需要执行的操作声明在call方法中
    public Object call() throws Exception {
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }
}
public class ThreadNew {
    public static void main(String[] args) {
        //3.创建callable接口实现类的对象
        NumThread num=new NumThread();

        //4.将此callable接口实现类的对象作为参数传递到Future Task构造器中，创建FutureTask对象
        FutureTask futureTask = new FutureTask(num);
        Object sum = null;

        //5.将futuretask的对象作为参数传递到thread类的构造器中
        new Thread(futureTask).start();

        try {
            //get方法的返回值即为 FutureTask构造器参数Callable实现类重写的call方法的返回值
            //6.获取callable中call的返回值
            sum = futureTask.get();
            System.out.println("和为："+sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
