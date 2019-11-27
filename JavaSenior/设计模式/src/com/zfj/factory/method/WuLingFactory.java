package com.zfj.factory.method;

/**
 * @Author zfj
 * @create 2019/11/23 20:22
 */
public class WuLingFactory implements CarFactory {
    public Car getCar() {
        return new WuLing();
    }
}
