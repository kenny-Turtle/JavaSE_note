package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * @Author zfj
 * @create 2019/10/28 16:06
 */
public class FileReaderWriterTest_test {

    @Test
    public void MyFileReader(){
        FileReader fr= null;
        try {
            //1.create File
            File file=new File("hello.txt");
            //2.创建输入流
            fr = new FileReader(file);
            //3.输入操作
            int data;
            while((data=fr.read())!=-1){
                System.out.println((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr!=null){

                //4.close
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Test
    public void MyFileReader1(){
        FileReader fr= null;
        try {
            //1
            File file=new File("hello.txt");
            //2
            fr = new FileReader(file);
            //3
            char[] cbuf=new char[5];
            int len;
            while((len=fr.read(cbuf))!=-1){
                String str=new String(cbuf,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //4
            try {
                if(fr!=null)
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void MyFileWriter(){
        FileWriter fw= null;
        try {
            //1
            File file=new File("hello1.txt");
            //2
            fw = new FileWriter(file);
            //3
            fw.write("another one");
            //4
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fw!=null)
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void MyFileReaderWriter(){
        FileReader fr= null;
        FileWriter fw= null;
        try {
            //1
            File file1=new File("hello.txt");
            File file2=new File("hello1.txt");
            //2
            fr = new FileReader(file1);
            fw = new FileWriter(file2);
            //3
            char[] cbuf=new char[5];
            int len;
            while((len=fr.read(cbuf))!=-1){
                fw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




    /*
    * 图片的复制与粘贴
    * */

    @Test
    public void MyImgReaderWriter(){
        FileInputStream fis= null;
        FileOutputStream fos= null;
        try {
            //1
            File file1=new File("img\\1.jpg");
            File file2=new File("img\\2.jpg");
            //2
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);
            //3
            byte[] bbuf=new byte[1024];
            int len;
            while((len=fis.read(bbuf))!=-1){
                fos.write(bbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }










}
