package com.atguigu.java;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现TCP的网络编程
 * 例子1：
 *
 * @Author zfj
 * @create 2019/11/1 15:45
 */
public class TCPTest1 {

    //客户端
    @Test
    public void client(){

        Socket socket= null;
        OutputStream os = null;
        try {
            InetAddress inet=InetAddress.getByName("192.168.192.1");
            socket = new Socket(inet,8899);
            os = socket.getOutputStream();
            os.write("你好我是客户端".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(os!=null){

                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket!=null){

                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    //服务器端
    @Test
    public void server() {

        ServerSocket serverSocket = null;
        Socket socket= null;
        InputStream is = null;
        ByteArrayOutputStream baos= null;
        try {
            serverSocket = new ServerSocket(8899);

            socket = serverSocket.accept();

            is = socket.getInputStream();

            //不建议这样写，可能会有乱码
//        byte[] buffer=new byte[1024];
//        int len;
//        while((len=is.read(buffer))!=-1){
//            String str=new String(buffer,0,len);
//            System.out.println(str);
//        }
            baos = new ByteArrayOutputStream();
            byte[] buffer=new byte[5];
            int len;
            while((len=is.read(buffer))!=-1){
                baos.write(buffer,0,len);
            }

            System.out.println(baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(baos!=null){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if(serverSocket!=null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }


    }

}
