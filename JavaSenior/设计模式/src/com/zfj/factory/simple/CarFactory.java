package com.zfj.factory.simple;

/**
 * @Author zfj
 * @create 2019/11/23 20:07
 *
 * 普通工厂模式，静态工厂模式
 * 增加一个新的产品，而不修改工厂类是不太现实的。
 *
 */
public class CarFactory {

    public static Car getCar(String car){
        if(car.equals("五菱"))
            return new WuLing();
        else if(car.equals("特斯拉"))
            return new Tesia();
        else
            return null;
    }
}
