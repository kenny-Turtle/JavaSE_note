package com.zfj.factory.method;

/**
 * @Author zfj
 * @create 2019/11/23 20:05
 */
public class Customer {
    public static void main(String[] args) {
        Car car1=new WuLingFactory().getCar();
        Car car2=new TeslaFactory().getCar();
        Car car3 = new MoBaiFactory().getCar();
        car1.name();
        car2.name();
        car3.name();
    }
}
