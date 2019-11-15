package com.atguigu.java;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 一、网络编程中有两个主要的问题：
 *   1.如何准确的定位网络上伊塔斯或者多台主机；定位主机上特定的应用
 *   2.找到主机后如何进行可靠高效的数据传输
 *
 * 二、网络编程中的两个要素：
 *   1.对应问题一：IP和端口号
 *   2.对应问题二：提供网络通信协议：TCP/IP参考模型（应用层、传输层、网络层、物理+数据链路层）
 *
 * 三、通信要素一：IP和端口号
 *
 * 1.IP：唯一的标识 Internet 上的计算机（通信实体）
 * 2.在Java中使用InetAdreess类代表IP
 * 3.IP分类：IPv4和IPv6 ；万维网和局域网
 * 4.域名：
 * 5.本地回路地址： 192.168.192.1   对应：；localhost
 * 6.实例化InetAdress   getByName   getLocalHost
 *
 * 7.端口号：正在计算机上运行的进程
 *   要求：不同的进程有不同的端口号
 *
 * @Author zfj
 * @create 2019/11/1 15:00
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress inet2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inet2);

            InetAddress inet3 = InetAddress.getLocalHost();
            System.out.println(inet3);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

}
