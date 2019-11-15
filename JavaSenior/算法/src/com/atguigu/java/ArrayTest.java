package com.atguigu.java;

import org.junit.Test;

/**
 * 算法的考察：数组的复制、反转、查找（线性查找、二分查找）
 *
 * @Author zfj
 * @create 2019/11/4 18:22
 */
public class ArrayTest {

    @Test
    public void test1(){

        String[] arr=new String[]{"JJ","DD","MM","BB","GG","AA"};

        //数组的复制
        String[] arr1=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }

        //数组的反转
        for(int i=0;i<arr.length / 2;i++){
            String temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        for(String str:arr){
            System.out.print(str+" ");
        }



    }
    @Test
    public void test3(){
        //查找（或搜索）
        //线性查找：

        //二分查找
        int[] arr2=new int[]{-98,-23,2,34,45,56,67,78,79,88,89,99,111,234,345,456,567,678,789};

        int dest=98;
        int head=0;
        int end=arr2.length-1;
        boolean Flag=true;
        while(head<=end){
            int middle=(head+end)/2;
            if(dest==arr2[middle]){
                System.out.println("we find it");
                Flag=false;
                break;
            }else if(arr2[middle]>dest){
                end=middle-1;
            }else{
                head=middle+1;
            }
        }
        if(Flag){
            System.out.println("no");
        }
    }
}
