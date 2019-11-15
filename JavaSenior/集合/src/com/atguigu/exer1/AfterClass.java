package com.atguigu.exer1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * @Author zfj
 * @create 2019/11/1 14:16
 */
public class AfterClass {

    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("请输入第"+(i+1)+"个数");
            list.add(sc.next());
        }
        for(int j=9;j>=0;j--){
            System.out.println(list.get(j)+"\t");
        }
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }

}
