package com.atguigu.java2;

/**
 * @Author zfj
 * @create 2019/10/27 17:28
 */
class Clerk1{

    private int num=0;
    public synchronized void producerProduc() {
        if(num>20){
            num++;
            System.out.println(Thread.currentThread().getName()+"开始生产第"+num+"个产品");
        }else{
            notify();
        }
    }

    public synchronized void customerProduct() {
        if(num>0){
            System.out.println(Thread.currentThread().getName()+"开始消费第"+num+"个产品");
            num--;
        }else{
            notify();
        }
    }
}
class Producter1 implements Runnable{

    private Clerk1 clerk1;

    public Producter1(Clerk1 clerk1) {
        this.clerk1 = clerk1;
    }

    public void run() {
        while(true){
            System.out.println(Thread.currentThread().getName()+"开始生产产品。。。");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk1.producerProduc();

        }
    }
}
class Customer1 implements  Runnable{

    private Clerk1 clerk1;

    public Customer1(Clerk1 clerk1) {
        this.clerk1 = clerk1;
    }

    public void run() {
        while(true){
            System.out.println(Thread.currentThread().getName()+"开始消费产品。。。");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk1.customerProduct();


        }
    }
}

public class ProductTest1 {
    public static void main(String[] args) {
        Clerk1 clerk1=new Clerk1();
         Customer1 c1=new Customer1(clerk1);
        Producter1 p1=new Producter1(clerk1);

    }
}
