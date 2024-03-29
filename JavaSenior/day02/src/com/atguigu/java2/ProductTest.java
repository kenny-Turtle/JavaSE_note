package com.atguigu.java2;

/**
 * 线程通信的应用：经典问题：生产者/消费者问题
 *
 * 生产者（Productor）将产品交给店员（Clerk），而消费者（Customer）从店员出取走产品，
 * 店员一次只能持有固定数量的产品，如果生产者试图产生更多的产品，店员会叫生产者停一下，
 * 如果店中有空位放产品了再通知生产者继续生产
 * 如果店中没有产品了，店员会告诉消费者等一下，
 * 如果店中有了产品再通知消费者来取走产品
 *
 *
 * 分析：
 *      1，是否是多线程？ 是，生产者线程，消费者线程
 *      2，是否有共享数据？ 有，店员（或者产品，产品数量）
 *      3，如何解决线程安全问题？同步机制，有三种方法
 *      4，是否涉及到线程通信？是
 *
 * @Author zfj
 * @create 2019/10/27 17:00
 */
class Clerk{

    private int productCount=0;

    //生产产品
    public synchronized void produceProduct() {
        if(productCount<20){
            productCount++;
            System.out.println(Thread.currentThread().getName()+"：开始生产第"+productCount+"个产品");

            notify();

        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //消费产品
    public synchronized void customeProduct(){
        if(productCount>0){
            System.out.println(Thread.currentThread().getName()+"：开始消费第"+productCount+"个产品");
            productCount--;

            notify();

        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer extends Thread{
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始生产产品。。。。");

        while(true){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}

class Customer extends Thread{
    private Clerk clerk;

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始消费产品。。。。");
        while(true){
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.customeProduct();
        }
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk=new Clerk();

        Producer p1=new Producer(clerk);
        p1.setName("生产者");

        Customer c1=new Customer(clerk);
        c1.setName("消费者");

        p1.start();
        c1.start();
    }
}
