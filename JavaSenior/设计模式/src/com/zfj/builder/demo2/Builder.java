package com.zfj.builder.demo2;

/**
 * @Author zfj
 * @create 2019/11/25 18:05
 *
 */
public abstract class Builder {

    abstract Builder builderA(String msg);
    abstract Builder builderB(String msg);
    abstract Builder builderC(String msg);
    abstract Builder builderD(String msg);

    abstract Product getProduct();
}
