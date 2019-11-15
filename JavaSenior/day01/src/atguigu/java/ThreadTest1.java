package atguigu.java;

/**
 * 创建多线程的方式二： 实现runnable接口
 * 1，创建一个实现类runnable接口的类
 * 2，实现类去实现runnable中的抽象方法：run()
 * 3，创建实现类的对象
 * 4，将此对象最为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5，通过Thread类的对象调用start()
 *
 *
 * 比较两种创建线程的方式。
 *
 *  开发中：优先选择： 实现runnable接口的方式
 *    原因：1，实现的方式没有类的单继承的局限性
 *         2， 实现的方式更适合来处理来处理多个线程有共享数据的情况
 *    联系：public class Thread impliments Runnable
 *    相同点：两种方式都重写了run方法，将线程要执行的逻辑声明在run里面。

 * @Author zfj
 * @create 2019/10/26 13:26
 */
class MThread implements Runnable{

    public void run() {
        for(int i=0;i<100;i++){
            if(i%2==0)
                System.out.println(Thread.currentThread().getName()+":"+i+":");
        }
    }
}
public class ThreadTest1 {
    public static void main(String[] args) {
        MThread mThread=new MThread();
        Thread t1 = new Thread(mThread);
        Thread t2=new Thread(mThread);
        t1.setName("线程一");
        t2.setName("线程二");
        t1.start();
        t2.start();
    }
}
