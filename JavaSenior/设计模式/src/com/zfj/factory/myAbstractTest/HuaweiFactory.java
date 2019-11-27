package com.zfj.factory.myAbstractTest;

/**
 * @Author zfj
 * @create 2019/11/23 22:05
 */
public class HuaweiFactory implements IProduct {
    public IPhoneProduct iPhoneProduct() {
        return new HuaweiPhone();
    }

    public IBookProduct iBookProduct() {
        return new HuaweiBook();
    }
}
