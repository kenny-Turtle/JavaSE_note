package com.zfj.factory.abstract1;

/**
 * @Author zfj
 * @create 2019/11/23 21:38
 */
public class Customer {
    public static void main(String[] args) {
        IphoneProduct iphoneProduct = new XiaomiFactory().iphoneProduct();
        IphoneProduct iphoneProduct1 = new HuaweiFactory().iphoneProduct();
        iphoneProduct.start();
        iphoneProduct1.start();

        IBookProduct iBookProduct = new XiaomiFactory().iBookProduct();
        iBookProduct.start();
        IBookProduct iBookProduct1 = new HuaweiFactory().iBookProduct();
        iBookProduct1.start();
    }
}
