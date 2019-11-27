package com.zfj.prototype.demo01;

import java.util.Date;

/**
 * @Author zfj
 * @create 2019/11/25 22:31
 * 客户端，克隆
 */
public class Bilibili {
    public static void main(String[] args) throws CloneNotSupportedException {

        //原型对象 v1
        Date date = new Date();
        Video v1 = new Video("javaTitle", date);

        System.out.println("v1---->"+v1);
        System.out.println("v1--hashcode-->"+v1.hashCode());

        //v1可以克隆出来v2
        Video v2 = (Video)v1.clone();//克隆出来的对象是和原来一模一样的
        System.out.println("v2-->"+v2);
        System.out.println("v1--hashcode-->"+v2.hashCode());

    }
}
