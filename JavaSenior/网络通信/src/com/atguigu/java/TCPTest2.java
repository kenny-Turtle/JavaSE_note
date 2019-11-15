package com.atguigu.java;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现TCP的网络编程
 * 例题2：客户端发送文件给服务端，服务端将文件保存在本地
 *
 * @Author zfj
 * @create 2019/11/1 19:36
 */
public class TCPTest2 {

    @Test
    public void client(){
        Socket socket= null;
        OutputStream os= null;
        FileInputStream fis= null;
        try {
            InetAddress inet = InetAddress.getByName("192.168.192.1");
            socket = new Socket(inet,8889);
            os = socket.getOutputStream();
            fis = new FileInputStream(new File("1.jpg"));

            byte[] buffer=new byte[1024];
            int len;
            while((len=fis.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
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
        }

    }
    @Test
    public void server(){

        ServerSocket ss= null;
        InputStream is= null;
        FileOutputStream fos= null;
        try {
            ss = new ServerSocket(8889);
            Socket socket=ss.accept();
            is = socket.getInputStream();

            fos = new FileOutputStream(new File("2.jpg"));
            byte[] buffer=new byte[1024];
            int len;
            while((len=is.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }
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
                ss.close();
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
