package com.atguigu.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 从键盘输入10个整数保持到List中，并按照倒叙，从大到小的顺序显示出来
 * @Author zfj
 * @create 2019/11/3 15:56
 */
public class exer_my {

    public static void main(String[] args) {
        List list=new ArrayList();
        for(int i=0;i<10;i++){
            System.out.println("输入第:"+(i+1)+"个数\t");
            Scanner sc=new Scanner(System.in);
            list.add(sc.next());
        }
        Collections.sort(list);
//        Collections.reverse(list);
        System.out.println(list);
    }

}
