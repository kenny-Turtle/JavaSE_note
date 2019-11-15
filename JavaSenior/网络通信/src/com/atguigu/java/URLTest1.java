package com.atguigu.java;

import sun.text.normalizer.RuleCharacterIterator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Author zfj
 * @create 2019/11/3 10:27
 */
public class URLTest1 {
    public static void main(String[] args) {
        HttpURLConnection urlConnection = null;
        InputStream is = null;
        FileOutputStream fos= null;
        try {
            URL url=new URL("https://www.csdn.net/");

            urlConnection = (HttpURLConnection) url.openConnection();

            urlConnection.connect();
            is = urlConnection.getInputStream();
            fos = new FileOutputStream("JavaSenior\\网络通信\\my2.html");
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
            urlConnection.disconnect();
        }

    }
}
