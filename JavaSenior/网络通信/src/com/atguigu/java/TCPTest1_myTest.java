package com.atguigu.java;

import com.sun.org.apache.xml.internal.serializer.OutputPropertiesFactory;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author zfj
 * @create 2019/11/1 16:13
 */
public class TCPTest1_myTest {

    @Test
    public void Client_my(){
        Socket socket= null;
        OutputStream os= null;
        try {
            InetAddress inet = InetAddress.getByName("192.168.192.1");
            socket = new Socket(inet,8889);
            os = socket.getOutputStream();
            os.write("第三地尝试".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
    public void Server_my(){

        ServerSocket ss= null;
        InputStream is= null;
        ByteArrayOutputStream baos= null;
        try {
            ss = new ServerSocket(8889);
            Socket socket=ss.accept();
            is = socket.getInputStream();
            baos = new ByteArrayOutputStream();

            byte[] buff=new byte[20];
            int len;
            while((len=is.read(buff))!=-1){
                baos.write(buff,0,len);
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
