package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 *
 * 缓冲流的使用
 *
 * 1.缓冲流：
 *      BufferedInputStream
 *      BufferedOutputStream
 *      BufferedReader
 *      BufferedWriter
 *
 * 2.作用：提高流的读取和写入的速度
 *        提升速度的原因，内部提供了一个缓存区
 *
 * 3.处理流，就是“套接”在已有流的基础上。
 *
 * @Author zfj
 * @create 2019/10/28 18:33
 */
public class BufferedTest {

    /*
    * 实现非文本文件的复制
    * */
    @Test
    public void BufferedCopyPaste(){
        BufferedInputStream bis= null;
        BufferedOutputStream bos= null;
        try {
            //1
            File srcFile=new File("img\\1.jpg");
            File destFile=new File("img\\2.jpg");
            //2
            FileInputStream fis=new FileInputStream(srcFile);
            FileOutputStream fos=new FileOutputStream(destFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            //3
            byte[] buffer=new byte[10];
            int len;
            while((len=bis.read(buffer))!=-1){
                bos.write(buffer,0,len);

                //刷新缓存区
                bos.flush();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4
            try {
                if(bos!=null)
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bis!=null)
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void CopyFileWithBuffered(String srcPath,String destPath){
        BufferedInputStream bis= null;
        BufferedOutputStream bos= null;
        try {
            //1
            File srcFile=new File(srcPath);
            File destFile=new File(destPath);
            //2
            FileInputStream fis=new FileInputStream(srcFile);
            FileOutputStream fos=new FileOutputStream(destFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            //3
            byte[] buffer=new byte[10];
            int len;
            while((len=bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }
            System.out.println("复制完成。");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4
            try {
                if(bos!=null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bis!=null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void testCopyFileWithBuffered(){
        String src="img\\1.jpg";
        String dest="3.jpg";

        long start=System.currentTimeMillis();

        CopyFileWithBuffered(src,dest);

        long end=System.currentTimeMillis();

        System.out.println("复制耗时："+(end-start));


    }

    @Test
    public void testBufferedReaderWriter(){
        BufferedReader br= null;
        BufferedWriter bw= null;
        try {
            //1,2,
            br = new BufferedReader(new FileReader(new File("zfj.txt")));
            bw = new BufferedWriter(new FileWriter(new File("zfj1.txt")));
            //3.读写操作
            //方式一
//            char[] cbuf=new char[1024];
//            int len;
//            while((len=br.read(cbuf))!=-1){
//                bw.write(cbuf,0,len);
//            }
            //方式二
            String data;
            while((data=br.readLine())!=null){
                //方法一
                //bw.write(data+"\n");//data中不包含换行符
                //方法二
                bw.write(data);
                bw.newLine();//换行
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //4
            if(bw!=null){

                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(br!=null){

                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }





    }

}
