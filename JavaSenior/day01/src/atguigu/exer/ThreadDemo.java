package atguigu.exer;

/**
 * 练习：创建两个分线程，其中一个遍历100以内的偶数，另一个遍历基数
 *
 * @Author zfj
 * @create 2019/10/25 14:26
 */
public class ThreadDemo {
    public static void main(String[] args) {
//        MyThread1 t1 = new MyThread1();
//        MyThread2 t2 = new MyThread2();
//        t1.start();
//        t2.start();
        //创建Thread类的匿名子类的方式
        new Thread(){
            public void run() {
                for(int i=0;i<100;i++){
                    if(i%2==0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();
        new Thread(){
            public void run() {
                for(int i=0;i<100;i++){
                    if(i%2!=0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();
    }
}

class MyThread1 extends Thread{
    public void run() {
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

class MyThread2 extends Thread{
    public void run() {
        for(int i=0;i<100;i++){
            if(i%2!=0){
                System.out.println(i+"*");
            }
        }
    }
}

