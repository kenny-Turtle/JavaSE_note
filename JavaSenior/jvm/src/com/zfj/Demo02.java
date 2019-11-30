package com.zfj;

/**
 * @Author zfj
 * @create 2019/11/30 10:18
 */
public class Demo02 {
    public static void main(String[] args) {
        //返回虚拟机试图使用的最大内存
        long max=Runtime.getRuntime().maxMemory();//字节  1024*1024
        //返回jvm的初始化总内存
        long total=Runtime.getRuntime().totalMemory();

        System.out.println("max="+max+"字节\t"+(max/(double)1024/1024)+"MB");
        System.out.println("total="+total+"字节\t"+(total/(double)1024/1024)+"MB");

        //默认情况下：非配得总内存 是电脑内存的1//4 ，而初始化内存是1/16
    }

    //OOM:
        //1、尝试扩大堆内存空间
        //2、分析内存，看一下那个地方出现了问题（专业工具）
}
