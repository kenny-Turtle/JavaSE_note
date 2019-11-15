package com.atguigu.java;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现TCP的网络编程
 *  * 例题2：客户端发送文件给服务端，服务端将文件保存在本地
 * @Author zfj
 * @create 2019/11/1 19:46
 */
public class TCPTest2_myTest {
    @Test
    public void client1(){
        Socket socket= null;
        FileInputStream fis= null;
        OutputStream os= null;
        try {
            socket = new Socket(InetAddress.getByName("192.168.192.1"),8889);
            fis = new FileInputStream(new File("4.jpg"));
            os = socket.getOutputStream();
            byte[] buff=new byte[1024];
            int len;
            while((len=fis.read(buff))!=-1){
                os.write(buff,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
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
    public void server1(){

        ServerSocket ss= null;
        Socket socket= null;
        InputStream is= null;
        FileOutputStream fos= null;
        try {
            ss = new ServerSocket(8889);
            socket = ss.accept();
            is = socket.getInputStream();
            fos = new FileOutputStream(new File("5.jpg"));
            byte[] buff=new byte[1024];
            int len;
            while((len=is.read(buff))!=-1){
                fos.write(buff,0,len);
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
