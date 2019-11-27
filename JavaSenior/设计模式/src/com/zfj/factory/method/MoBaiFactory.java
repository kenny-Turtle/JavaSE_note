package com.zfj.factory.method;

/**
 * @Author zfj
 * @create 2019/11/23 20:28
 */
public class MoBaiFactory implements CarFactory {
    public Car getCar() {
        return new MoBai();
    }
}
