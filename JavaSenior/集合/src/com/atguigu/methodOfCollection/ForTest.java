package com.atguigu.methodOfCollection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * jdk5.0 新增了foreach循环，用于遍历集合，数组
 *
 * @Author zfj
 * @create 2019/10/30 18:04
 */
public class ForTest {


    @Test
    public void test1(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);


        for(Object obj:coll){
            System.out.println(obj);

        }
    }

    //练习题
    @Test
    public void test2(){
        String[] arr=new String[]{"MM","MM","MM"};

//        for(int i=0;i<arr.length;i++){
//            arr[i]="GG";
//        }

        //增强for循环
        for(String str:arr){
            str="GG";
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }









}
