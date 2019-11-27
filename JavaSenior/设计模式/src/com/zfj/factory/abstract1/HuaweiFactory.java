package com.zfj.factory.abstract1;

/**
 * @Author zfj
 * @create 2019/11/23 21:37
 */
public class HuaweiFactory implements IProductFactory {
    public IphoneProduct iphoneProduct() {
        return new Huawei();
    }

    public IRoterProduct iRoterProduct() {
        return new HuaweiRouter();
    }

    public IBookProduct iBookProduct() {
        return new HuaweiBook();
    }
}
