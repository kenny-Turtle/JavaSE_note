package com.zfj.factory.abstract1;

/**
 * @Author zfj
 * @create 2019/11/23 21:30
 */
public class HuaweiRouter implements IRoterProduct {
    public void start() {
        System.out.println("华为路由器启动");
    }

    public void shutdown() {
        System.out.println("华为路由器关闭");
    }

    public void openWifi() {
        System.out.println("华为路由器打开WiFi");
    }

    public void setting() {
        System.out.println("华为路由器设置");
    }
}
