package com.itzfj.JavaSE;

import org.junit.Test;

/**
 * @Author zfj
 * @create 2019/11/13 11:04
 */
public class zizeng {
    @Test
    public void test1(){
        int i=1;
        i=i++;
        System.out.println(i);
        int j=i++;
        System.out.println(j);
        System.out.println(i);
        int k=i+ ++i*i++;//15
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
