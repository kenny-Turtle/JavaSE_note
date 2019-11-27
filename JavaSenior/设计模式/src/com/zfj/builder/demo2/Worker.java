package com.zfj.builder.demo2;

/**
 * @Author zfj
 * @create 2019/11/25 18:10
 *
 */
public class Worker extends Builder{

    private Product product;
    public Worker(){
        product=new Product();
    }

    Builder builderA(String msg) {
        product.setBuildA(msg);
        return this;
    }

    Builder builderB(String msg) {
        product.setBuildB(msg);
        return this;
    }

    Builder builderC(String msg) {
        product.setBuildC(msg);
        return this;
    }

    Builder builderD(String msg) {
        product.setBuildD(msg);
        return this;
    }

    Product getProduct() {
        return product;
    }
}
