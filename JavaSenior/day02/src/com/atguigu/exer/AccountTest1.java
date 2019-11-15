package com.atguigu.exer;

/**
 *
 * 使用实现runnable的方式
 *
 * @Author zfj
 * @create 2019/10/27 16:02
 */
class Account1{
    private static double balance;

    public Account1(double balance) {
        this.balance = balance;
    }

    //存钱
    public synchronized void desposit(double amt){
        if(amt>0){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance+=amt;
            System.out.println(Thread.currentThread().getName()+"存入："+balance);
        }
    }

}

class Customer1 implements Runnable{

    private Account1 acct;

    public Customer1(Account1 acct) {
        this.acct = acct;
    }

    public void run() {
        for(int i=1;i<4;i++){
            acct.desposit(1000);
        }
    }
}
public class AccountTest1 {
    public static void main(String[] args) {
        Account1 acct=new Account1(0);
        Customer1 c1=new Customer1(acct);
        Customer1 c2=new Customer1(acct);
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);

        t1.setName("甲");
        t2.setName("乙");
        t1.start();
        t2.start();
    }
}
