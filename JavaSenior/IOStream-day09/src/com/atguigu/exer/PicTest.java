package com.atguigu.exer;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author zfj
 * @create 2019/10/29 12:45
 */
public class PicTest {

    //图片加密
    @Test
    public void test1(){
        FileInputStream fis= null;
        FileOutputStream fos= null;
        try {
            fis = new FileInputStream("img\\1.jpg");
            fos = new FileOutputStream("img\\3.jpg");

            byte[] buffer=new byte[20];
            int len;
            while((len=fis.read(buffer))!=-1){
                //字节数组进行修改
                //错误


                //正确
                for(int i=0;i<len;i++){
                    buffer[i]= (byte) (buffer[i]^5);
                }



                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos!=null){

                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis!=null){

                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



    @Test
    public void PicTest1(){
        FileInputStream fis= null;
        FileOutputStream fos= null;
        try {
            fis = new FileInputStream("img\\3.jpg");
            fos = new FileOutputStream("img\\4.jpg");

            byte[] buffer=new byte[20];
            int len;
            while((len=fis.read(buffer))!=-1){
                //字节数组进行修改
                //错误


                //正确
                for(int i=0;i<len;i++){
                    buffer[i]= (byte) (buffer[i]^5);
                }



                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos!=null){

                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis!=null){

                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }















}
