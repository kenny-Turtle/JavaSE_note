package com.zfj;

/**
 * @Author zfj
 * @create 2019/11/29 17:04
 */
public class Demo {
    public static void main(String[] args) {
        new Thread(()->{

        },"my thred name").start();
    }

    //native：凡是带了native关键字的，说明Java的作用到达不到了，会去第哦啊用底层C语言的库
    //会进入本地的方法栈
    //调用本地方法本地接口 JNI
    //JNI作用：扩展Java的使用，融合不同的编程语言为Java所用，最初：C，C++
    //他在内存区域中专门开启了以快标记区域：Native Method Stack，等级Native方法
    //在最终执行的时候，加载本地方法库中的方法通过JNI

    //Java程序驱动打印机，管理系统，掌握即可，在企业级应用中较为少见
    public native void start0();


    //调用其他接口： Socket， WebService~
}
