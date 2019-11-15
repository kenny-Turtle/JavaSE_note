package com.itzfj.JavaSE.test;

import java.util.Arrays;

/**
 *
 * 方法的传参机制
 *    |--形参是基本数据类型
 *       |--传递数据值
 *    |--实参是引用数据类型
 *       |--传递地址值
 *       |--特殊类型：String、包装类等对象不可变性
 *
 *
 * String、包装类等对象的不可变性
 *
 * @Author zfj
 * @create 2019/11/13 14:06
 */
public class Param {
    public static void main(String[] args) {
        int i=1;
        String str="hello";
        Integer num=2;
        int[] arr={1,2,3,4,5};
        MyData my=new MyData();

        change(i,str,num,arr,my); //实参列表
        System.out.println(i);
        System.out.println(str);
        System.out.println(num);
        System.out.println(Arrays.toString(arr));
        System.out.println(my.a);

    }
    public static void change(int j,String s,Integer n,int[] a,MyData m){//形参列表
        j+=1;
        s+="world";
        n+=1;
        a[0]+=1;
        m.a+=1;
    }
}
class MyData{
    int a=10;
}
