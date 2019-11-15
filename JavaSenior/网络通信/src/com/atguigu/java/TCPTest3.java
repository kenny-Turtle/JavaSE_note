package com.atguigu.java;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 例子3
 * 从客户端返送文件到服务端，服务端接收文件并保存，然后服务端给客服端反馈
 *
 * @Author zfj
 * @create 2019/11/1 20:00
 */
public class TCPTest3 {

    @Test
    public void client(){
        Socket socket= null;
        OutputStream os= null;
        FileInputStream fis= null;
        InputStream is=null;
        ByteArrayOutputStream baos=null;
        try {
            socket = new Socket(InetAddress.getByName("192.168.192.1"),8889);
            os = socket.getOutputStream();
            fis = new FileInputStream(new File("3.jpg"));
            byte[] buff=new byte[1024];
            int len;
            while((len=fis.read(buff))!=-1){
                os.write(buff,0,len);
            }
            //关闭
            socket.shutdownOutput();
            is=socket.getInputStream();
            baos=new ByteArrayOutputStream();
            byte[] buff1=new byte[1024];
            int len1;
            while((len1=is.read(buff1))!=-1){
                baos.write(buff1,0,len1);
            }
            System.out.println(baos.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    @Test
    public void server(){
        ServerSocket ss= null;
        Socket socket= null;
        InputStream is= null;
        FileOutputStream fos= null;
        OutputStream os=null;
        try {
            ss = new ServerSocket(8889);
            socket = ss.accept();
            is = socket.getInputStream();
            fos = new FileOutputStream(new File("4.jpg"));
            byte[] buff=new byte[1024];
            int len;
            while((len=is.read(buff))!=-1){
                fos.write(buff,0,len);
            }
            System.out.println("图片传输完成");
            os=socket.getOutputStream();
            os.write("照片我已收到.".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }





    }

}
