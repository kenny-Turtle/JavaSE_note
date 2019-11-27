package com.zfj.factory.myAbstractTest;

/**
 * @Author zfj
 * @create 2019/11/23 22:04
 */
public class XiaomiFactory implements IProduct{

    public IPhoneProduct iPhoneProduct() {
        return new XiaomiPhone();
    }

    public IBookProduct iBookProduct() {
        return new XiaomiBook();
    }
}
