package com.zfj.factory.simple;

/**
 * @Author zfj
 * @create 2019/11/23 20:05
 */
public class Customer {
    public static void main(String[] args) {
        //1、传统方式
        Car car1=new WuLing();
        Car car2=new Tesia();

        //2、使用工厂
        Car wuLing = CarFactory.getCar("五菱");
        wuLing.name();
        }
}
