package com.zfj.builder.demo2;

/**
 * @Author zfj
 * @create 2019/11/25 18:16
 */
public class Test {
    public static void main(String[] args) {

        Worker worker = new Worker();
        //链式编程

        Product product = worker.builderA("全家桶").getProduct();
//        Product product = worker.getProduct();
        System.out.println(product.toString());

    }
}
