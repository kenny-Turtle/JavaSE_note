package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 *
 * 处理流之二
 * 1转换流：
 *      InputStreamReader：将一个字节的输入流转换为字符的输入流
 *      OutputStreamWriter：将一个字符的输出流转换为字节的输入流
 * 2.作用：提供字节流与字符流之间的转换
 *
 * 3. 解码： 字节、字符数组----->字符数组、字符串
 *    编码： 字符数组、字符串------>字节、字符数组
 *
 *
 * 4.字符集
 *
 * @Author zfj
 * @create 2019/10/29 15:24
 */
public class InputStreamReaderTest {



    @Test
    public void test1(){
        InputStreamReader isr= null;
        try {
            FileInputStream fis=new FileInputStream("zfj.txt");
//        InputStreamReader isr=new InputStreamReader(fis);//使用系统默认的字符集
            isr = new InputStreamReader(fis,"utf-8");
            char[] cbuf=new char[20];
            int len;
            while((len=isr.read(cbuf))!=-1){
                String str=new String(cbuf,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(isr!=null){

                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*
    * 综合使用InputStreamReader和OutputStreamWriter
    * */
    @Test
    public void test2() throws Exception {
        File file1=new File("zfj.txt");
        File file2=new File("zfj2.txt");

        FileInputStream fis=new FileInputStream(file1);
        FileOutputStream fos=new FileOutputStream(file2);

        InputStreamReader isr=new InputStreamReader(fis,"utf-8");
        OutputStreamWriter osw=new OutputStreamWriter(fos,"gbk");

        //2
        char[] cbuf=new char[20];
        int len;
        while((len=isr.read(cbuf))!=-1){
            osw.write(cbuf,0,len);
        }
        //
        osw.close();
        isr.close();
    }

    @Test
    public void MyTest(){
        InputStreamReader isr= null;
        try {
            File file=new File("zfj2.txt");
            FileInputStream fis=new FileInputStream(file);
            isr = new InputStreamReader(fis,"gbk");
            char[] cbuf=new char[20];
            int len;
            while((len=isr.read(cbuf))!=-1){
                String str=new String(cbuf,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(isr!=null){
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }














}
