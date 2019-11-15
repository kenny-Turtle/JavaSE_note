package com.atguigu.java;

import java.util.Arrays;

/**
 * @Author zfj
 * @create 2019/11/5 10:13
 */
public class QuickSort {
    private static void swap(int[] data,int i,int j){
        int temp=data[i];
        data[i]=data[j];
        data[j]=temp;
    }
    private static void subSort(int[] data,int start,int end){
        if(start<end){
            int base=data[start];
            int low=start;
            int high=end+1;
            while(true){
                while(low<high&&data[++low]-base<=0);
                while(high>start&&data[--high]-base>=0);
                if(low<high){
                    swap(data,low,high);
                }else{
                    break;
                }
            }
            subSort(data,start,high-1);
            subSort(data,high+1,end);
        }
    }

    public static void quickSort(int[] data){
        subSort(data,0,data.length-1);
    }
    public static void main(String[] args) {
        int[] data={9,-16,30,23,34,45,56,67,-43,-54};
        System.out.println("排序之前：\n"+ Arrays.toString(data));
        quickSort(data);
        System.out.println("排序之后：\n"+ Arrays.toString(data));
    }
}
