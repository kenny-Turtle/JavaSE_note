package com.atguigu.Map;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author zfj
 * @create 2019/11/3 14:47
 */
public class PropertiesTest {
    //用来处理配置文件   ，key和value都是string类型
    public static void main(String[] args) {
        FileInputStream fis= null;
        try {
            Properties prop=new Properties();
            fis = new FileInputStream("JavaSenior\\jdbc.properties");
            prop.load(fis);

            String name = prop.getProperty("name");
            String password = prop.getProperty("password");
            System.out.println(name+"  ."+password);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
