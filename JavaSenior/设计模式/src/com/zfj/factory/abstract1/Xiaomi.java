package com.zfj.factory.abstract1;

/**
 * @Author zfj
 * @create 2019/11/23 21:26
 */
public class Xiaomi implements IphoneProduct {
    public void start() {
        System.out.println("小米开机");
    }

    public void shutdown() {
        System.out.println("小米关机");
    }

    public void callup() {
        System.out.println("小米打电话");
    }

    public void sendMes() {
        System.out.println("小米发短信");
    }
}
