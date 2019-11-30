package com.zfj;

import java.util.Random;

/**
 * @Author zfj
 * @create 2019/11/30 10:29
 */
//-Xms8m -Xmx8m -XX:+PrintGCDetails
public class Hello {
    public static void main(String[] args) {
        String str="zhangfengjie";
        while(true){
            str += str + new Random().nextInt(888888888)+new Random().nextInt(999999999);
        }
    }
}
