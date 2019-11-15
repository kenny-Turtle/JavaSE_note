package com.atguigu.java;

import org.junit.Test;

import java.lang.annotation.Target;

/**
 * 数组的冒泡排序的实现
 * @Author zfj
 * @create 2019/11/5 9:58
 */
public class BubbleSortTest {
    @Test
    public void test1(){
        int[] arr=new int[]{43,32,76,-98,0,64,33,77,-23,45,-78,33,66,99,33,76};

        //冒泡排序
        for(int i=0;i<arr.length-1;i++){

            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        for(int i:arr){

            System.out.print(i+" ");
        }
    }
}
