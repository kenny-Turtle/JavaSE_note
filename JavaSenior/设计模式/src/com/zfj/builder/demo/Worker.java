package com.zfj.builder.demo;

/**
 * @Author zfj
 * @create 2019/11/25 17:46
 * 具体的建造者,工人，工人负责创建产品
 */
public class Worker extends Builder {

    private Product product;

    public Worker(){
        product=new Product();
    }


    void buildA() {
        product.setBuildA("地基");
        System.out.println("地基");
    }

    void buildB() {
        product.setBuildB("铺水泥");
        System.out.println("铺水泥");
    }

    void buildC() {
        product.setBuildC("电线");
        System.out.println("电线");
    }

    void buildD() {
        product.setBuildD("粉刷");
        System.out.println("粉刷");
    }

    Product getProduct() {
        return product;
    }
}
