package com.zfj.builder.demo;

/**
 * @Author zfj
 * @create 2019/11/25 17:53
 */
public class Test {
    public static void main(String[] args) {

        //指挥
        Director director = new Director();
        //指挥 具体的工人完成产品
        Product build = director.build(new Worker());
        build.toString();

    }
}
