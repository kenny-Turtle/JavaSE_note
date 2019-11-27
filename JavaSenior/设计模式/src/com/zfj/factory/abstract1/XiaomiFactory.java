package com.zfj.factory.abstract1;

/**
 * @Author zfj
 * @create 2019/11/23 21:36
 */
public class XiaomiFactory implements IProductFactory {
    public IphoneProduct iphoneProduct() {
        return new Xiaomi();
    }

    public IRoterProduct iRoterProduct() {
        return new XiaomiRouter();
    }

    public IBookProduct iBookProduct() {
        return new XiaomiBook();
    }
}
