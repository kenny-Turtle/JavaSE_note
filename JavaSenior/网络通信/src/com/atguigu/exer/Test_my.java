package com.atguigu.exer;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * .客户端给服务端发送文本，服务端会将文本转成大写再返回给客户端
 *
 * @Author zfj
 * @create 2019/11/3 9:23
 */
public class Test_my {
    @Test
    public void client1(){
        Socket socket= null;
        FileInputStream fis= null;
        OutputStream os= null;
        InputStream is= null;
        ByteArrayOutputStream baos= null;
        try {
            socket = new Socket(InetAddress.getByName("192.168.192.1"),8889);
            fis = new FileInputStream(new File("src\\com\\atguigu\\exer\\test.txt"));
            os = socket.getOutputStream();
            byte[] buff=new byte[20];
            int len;
            while((len=fis.read(buff))!=-1){
                os.write(buff,0,len);
            }
            socket.shutdownOutput();
            is = socket.getInputStream();
            baos = new ByteArrayOutputStream();
            int len1;
            while((len1=is.read(buff))!=-1){
                baos.write(buff,0,len1);
            }
            System.out.println(baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
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
    @Test
    public void server1(){
        ServerSocket ss= null;
        Socket socket= null;
        BufferedReader br= null;
        OutputStream os= null;
        try {
            ss = new ServerSocket(8889);
            socket = ss.accept();
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            os = socket.getOutputStream();
            String line;
            while((line=br.readLine())!=null){
                String s1=line.toUpperCase();
                os.write(s1.getBytes());
            }
            socket.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                ss.close();
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



}
