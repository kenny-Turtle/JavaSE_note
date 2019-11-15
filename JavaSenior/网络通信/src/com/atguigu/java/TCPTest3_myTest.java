package com.atguigu.java;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author zfj
 * @create 2019/11/3 8:56
 */
public class TCPTest3_myTest {
    @Test
    public void client3(){
        Socket socket= null;
        OutputStream os= null;
        FileInputStream fis= null;
        InputStream is= null;
        ByteArrayOutputStream baos= null;
        try {
            socket = new Socket(InetAddress.getByName("192.168.192.1"),8889);
            os = socket.getOutputStream();
            fis = new FileInputStream(new File("5.jpg"));
            byte[] buff=new byte[1024];
            int len;
            while((len=fis.read(buff))!=-1){
                os.write(buff,0,len);
            }
            socket.shutdownOutput();
            System.out.println("图片已发送");
            is = socket.getInputStream();
            baos = new ByteArrayOutputStream();
            byte[] buff2=new byte[20];
            int len2;
            while((len2=is.read(buff2))!=-1){
                baos.write(buff2,0,len2);
            }
            System.out.println(baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    @Test
    public void server3(){
        ServerSocket ss= null;
        Socket socket= null;
        InputStream is= null;
        FileOutputStream fos= null;
        OutputStream os= null;
        try {
            ss = new ServerSocket(8889);
            socket = ss.accept();
            is = socket.getInputStream();
            fos = new FileOutputStream(new File("6.jpg"));
            byte[] buff=new byte[1024];
            int len;
            while((len=is.read(buff))!=-1){
                fos.write(buff,0,len);
            }
            if(fos!=null){
                System.out.println("图片已存储到本地");
            }
            os = socket.getOutputStream();
            os.write("这里是服务端，图片已收到".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }
}
