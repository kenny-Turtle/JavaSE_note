package com.atguigu.java;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * 其他流的使用
 * 1，标准的输入，输出流
 * 2.打印流
 * 3.数据流
 *
 * @Author zfj
 * @create 2019/10/29 18:11
 */
public class OtherStreamTest {

    /*
    * 标准的输入输出流
    * System.in:标准的输入流，默认从键盘输入
    * System.out:标准的输出流，默认从控制台输出
    *
    *   System类的setIn(Stream) /setOut()方式重新指定输入和输出的流
    *
    * 练习：
    * 从键盘输入字符串，要求将读取到的整行字符串转成大写输出。然后继续进行输入操作，
    * 直至当输入“e“或者”exit“时，退出程序
    *
    * 方法一：使用Scanner实现
    * 方法二：使用System.in实现.     System.in --->转换流------>BufferedReader的readLine()
    *
    * */



    public static void main(String[] args) {
        BufferedReader bf= null;
        try {
            InputStreamReader isr=new InputStreamReader(System.in);
            bf = new BufferedReader(isr);
            while(true){
                System.out.println("请输入字符串");
                String data=bf.readLine();
                if("e".equalsIgnoreCase(data)||"exit".equalsIgnoreCase(data)){
                    System.out.println("程序结束");
                    break;
                }
                String s = data.toUpperCase();
                System.out.println(s);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
    * 2打印流
    *  提供一系列的
    * */


    /*
    * 3.数据流
    *
    * */

}
