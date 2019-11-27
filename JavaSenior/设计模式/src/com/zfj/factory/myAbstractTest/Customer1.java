package com.zfj.factory.myAbstractTest;

/**
 * @Author zfj
 * @create 2019/11/23 22:03
 */
public class Customer1 {
    public static void main(String[] args) {
        IPhoneProduct iPhoneProduct = new XiaomiFactory().iPhoneProduct();
        iPhoneProduct.start();
        IBookProduct iBookProduct = new HuaweiFactory().iBookProduct();
        iBookProduct.start();
        IBookProduct iBookProduct1 = new XiaomiFactory().iBookProduct();
        iBookProduct1.start();
    }
}
