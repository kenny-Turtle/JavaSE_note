package atguigu.java;

/**
 *
 * 例子：创建三个窗口卖票，总票数为100张  ,此时用的方法是方法一：继承Thread类的方法
 * @Author zfj
 * @create 2019/10/26 13:13
 */
class Window extends Thread{
    //此ticket必须定义成静态
    private static int ticket = 100;
    public void run() {
        while(true){

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(ticket>0){
                System.out.println(getName()+":卖票，票号为："+ticket);
                ticket--;
            }else
                break;
        }
    }
}
public class WindowTest {
    public static void main(String[] args) {
        Window t1=new Window();
        Window t2=new Window();
        Window t3=new Window();
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}
