package com.atguigu.exer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Author zfj
 * @create 2019/11/3 11:22
 */
public class URLTest1_my {
    public static void main(String[] args) {
        HttpURLConnection urlConnection = null;
        InputStream is= null;
        FileOutputStream fos= null;
        try {
            URL url=new URL("http://localhost:8080/examples/my.txt");
            urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.connect();
            is = urlConnection.getInputStream();
            fos = new FileOutputStream("JavaSenior\\网络通信\\src\\com\\atguigu\\exer\\my2.txt");
            byte[] buff=new byte[1024];
            int len;
            while((len=is.read(buff))!=-1){
                fos.write(buff,0,len);
            }
            System.out.println("下载完成");
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
            urlConnection.disconnect();
        }
    }
}
