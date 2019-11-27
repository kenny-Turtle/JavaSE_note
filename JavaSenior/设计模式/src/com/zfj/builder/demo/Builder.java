package com.zfj.builder.demo;

/**
 * @Author zfj
 * @create 2019/11/25 17:42
 * 抽象的建造者，定义方法
 */
public abstract class Builder {
    abstract void buildA();
    abstract void buildB();
    abstract void buildC();
    abstract void buildD();

    //完工，得到房子
    abstract Product getProduct();

}
