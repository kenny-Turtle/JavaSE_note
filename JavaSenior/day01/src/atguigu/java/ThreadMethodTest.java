package atguigu.java;

/**
 * 测试Thread类中的常用方法
 * 1.start();启动当前线程，调用当前的run方法（）
 * 2.run();通常需要重写Thread类中的此方法，将创建线程的具体操作方法写在这里面
 * 3.currentThread();静态方法，返回执行当前代码的线程
 * 4.getName();过去当前线程的名字
 * 5.setName();设置当前线程的方法
 * 6.yield();释放当前cpu的执行权
 * 7.join();在线程a中调用线程b的join方法，此时线程a就进入阻塞状态，直到线程b执行完毕之后，线程a才结束阻塞状态
 * 8.stop();已过时
 * 9.sleep(long millitime);让我们的线程睡眠，指定时间mililitime里
 *
 *
 * 程序的优先级
 * MAX_PRIORITY: 10
 * MIN_PRIORITY: 1
 * NORM_PRIORITY: 5
 *
 * 如何来获取和设置当前程序的优先级
 *  getPriority(): 获取当前线程的优先级
 *  setPriority(): 设置当前线程的优先级
 *
 *
 * @Author zfj
 * @create 2019/10/25 14:42
 */
public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread h1 = new HelloThread("分线程：");

//        h1.setName("线程一");

        //设置分线程的优先级
        h1.setPriority(Thread.MAX_PRIORITY);

        h1.start();

        //给主线程命名
        Thread.currentThread().setName("主线程：");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority()+":"+i+"*");
            }

//            if(i==20) {
//                try {
//                    h1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }

        }

        System.out.println(h1.isAlive());

    }
}

class HelloThread extends Thread{
    public void run() {
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority()+i);
            }

//            if(i%20==0){
//                this.yield();
//            }
        }
    }

    public HelloThread(String name){
        super(name);
    }
}
