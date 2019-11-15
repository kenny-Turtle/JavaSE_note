package atguigu.java;

/**
 * 例子：创建三个窗口卖票，总票数为100张   使用runnable接口的方法
 *
 * @Author zfj
 * @create 2019/10/26 13:41
 */
class mWindow2 implements Runnable{

    private  int ticket=100;
    public void run() {
        while(true){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+";票号："+ticket);
                ticket--;
            }else
                break;
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
