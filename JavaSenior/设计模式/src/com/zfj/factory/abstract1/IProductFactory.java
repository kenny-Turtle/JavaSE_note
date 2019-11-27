package com.zfj.factory.abstract1;

/**
 * @Author zfj
 * @create 2019/11/23 21:32
 * 抽象产品工厂
 */
public interface IProductFactory {

    //生产手机
    IphoneProduct iphoneProduct();
    //生产路由器
    IRoterProduct iRoterProduct();
    //生产笔记本
    IBookProduct iBookProduct();
}
