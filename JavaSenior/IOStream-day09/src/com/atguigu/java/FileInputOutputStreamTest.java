package com.atguigu.java;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * 结论
 * 1.对于文本文件(.txt,.java,.c,.c++)，使用字符流处理
 * 2.对于非文本文件(.jpg,.mp3,.mp4,.avi,.doc,.ppt)，使用字节流处理
 *
 * @Author zfj
 * @create 2019/10/28 16:36
 */
public class FileInputOutputStreamTest {

    @Test
    public void testFileInputOutputStream(){
        FileInputStream fis= null;
        try {
            File file=new File("hello.txt");
            fis = new FileInputStream(file);

            byte[] buffer=new byte[5];
            int len;
            while((len=fis.read(buffer))!=-1){
                String str=new String(buffer,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




    /*
    * 实现对图片的复制
    * */
    @Test
    public void testFIOStream(){
        FileInputStream fis= null;
        FileOutputStream fos= null;
        try {
            //1
            File srcFile=new File("img\\1.jpg");
            File destFile=new File("img\\3.jpg");
            //2
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            //3
            byte[] buffer=new byte[1024];
            int len;
            while((len=fis.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }
            System.out.println("复制成功。");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4
            try {
                if(fos!=null)
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fis!=null)
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public void CopyPaste(String srcP,String destP){
        FileInputStream fis= null;
        FileOutputStream fos= null;
        try {
            //1
            File srcFile=new File(srcP);
            File destFile=new File(destP);
            //2
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            //3
            byte[] buffer=new byte[1024];
            int len;
            while((len=fis.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }
            System.out.println("复制成功。");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4
            try {
                if(fos!=null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fis!=null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void CopyPasteTest(){
        long start=System.currentTimeMillis();

        String src="img\\1.jpg";
        String dest="img\\2.jpg";
        CopyPaste(src,dest);

        long end=System.currentTimeMillis();
        System.out.println("复制的时间是:"+(end-start));





    }






















}
