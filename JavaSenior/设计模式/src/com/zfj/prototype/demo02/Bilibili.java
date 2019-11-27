package com.zfj.prototype.demo02;

import java.util.Date;

/**
 * @Author zfj
 * @create 2019/11/25 22:31
 * spring Bean:单例模式，原型模式
 * 原型模式+工厂模式==》new==》原型模式
 */
public class Bilibili {
    public static void main(String[] args) throws CloneNotSupportedException {

        Date date = new Date();
        Video v1 = new Video("java", date);
        Video v2 = (Video) v1.clone();
        System.out.println("v1=="+v1);
        System.out.println("v2=="+v2);
        System.out.println("=================");
        date.setTime(31131);
        System.out.println("v1==="+v1);
        System.out.println("v2==="+v2);

    }
}
