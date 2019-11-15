package com.atguigu.exer;

/**
 *
 * 银行有一个账户
 * 有两个储户分别向同一个账户存3000元，每次存1000，存三次。每次存完打印账户余额。
 *
 *      分析
 *     1。是否是多线程？ 是！，两个储户
 *     2.是否有共享数据？ 有，账户（或账户余额）
 *     3.是否有线程安全问题？ 有
 *     4.需要考虑如何解决线程安全问题？同步机制：有三种方式。
 *
 * @Author zfj
 * @create 2019/10/27 15:41
 */
class Account{
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }
    //存钱
    public  synchronized void deposit(double amt){
        if(amt>0){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance+=amt;
            System.out.println(Thread.currentThread().getName()+"存钱成功。余额为："+balance);
        }
    }
}
class Customer extends Thread{
    private Account acct;

    public Customer(Account acct) {//在构造器当中，对属性做一个实例化
        this.acct = acct;
    }

    public void run() {
        for(int i=1;i<4;i++){
            acct.deposit(1000);
        }
    }
}
public class AccountTest {
    public static void main(String[] args) {
        Account acct=new Account(0);
        Customer c1=new Customer(acct);
        Customer c2=new Customer(acct);  //这里实现了  两个线程处理同一个账户

        c1.setName("甲");
        c2.setName("乙");

        c1.start();
        c2.start();
    }
}
