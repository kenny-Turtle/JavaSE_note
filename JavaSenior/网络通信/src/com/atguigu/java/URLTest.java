package com.atguigu.java;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * URL网络编程
 * 1.URL：同一资源定位符，对应着互联网的某一资源地址
 * 2.格式：
 *   http://localhot:8080/examples/beauty.jpg?username=zfj
 *   协议     主机名  端口号    资源地址          参数列表
 *
 * @Author zfj
 * @create 2019/11/3 10:06
 */
public class URLTest {
    public static void main(String[] args) throws MalformedURLException {

        URL url=new URL("http://localhost:8080/examples/my.txt");
        System.out.println(url.getPort());
        System.out.println(url.getHost());
    }
}
