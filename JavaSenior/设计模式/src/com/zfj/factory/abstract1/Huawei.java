package com.zfj.factory.abstract1;

/**
 * @Author zfj
 * @create 2019/11/23 21:27
 */
public class Huawei implements IphoneProduct {
    public void start() {
        System.out.println("华为开机");
    }

    public void shutdown() {
        System.out.println("华为关机");
    }

    public void callup() {
        System.out.println("华为打电话");
    }

    public void sendMes() {
        System.out.println("华为发短信");
    }
}
