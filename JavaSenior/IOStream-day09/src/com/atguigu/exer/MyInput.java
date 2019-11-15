package com.atguigu.exer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author zfj
 * @create 2019/10/29 19:09
 */
public class MyInput {

    //read a string from the keyboard
    public static String readString(){
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        //
        String string="";
        //get the string from the keyboard
        try {
            string=bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return string;
    }
    //Read an int value from the keyboard
    public static int readInt(){
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String string="";
        //get the string from the keyboard
        try {
            string=bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Integer.parseInt(string);

    }
    //read a double value from the keyboard
    //  return Double.parseDouble(stirng);

    //read a byte value from the keyboard
    // return Byte.parseByte(string);

    //read a short value from the keyboard
    // return Short.parseShort(string);

    //read a long value from the keyboard
    // return Long.parseLong(string);





}
