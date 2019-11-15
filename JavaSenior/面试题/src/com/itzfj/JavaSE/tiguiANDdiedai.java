package com.itzfj.JavaSE;

import org.junit.Test;

/**
 * 题目：有n步台阶，一次只能上1步或者2步，共有几种走法
 * 方法调用自身成为递归，利用变量的原值推出新值称为迭代
 * 1.递归
 *   优点：大问题转化为小问题，可以减少代码量，同时代码精简，可读性好
 *   缺点：递归调用浪费了空间，而且递归太容易造成堆栈的溢出
 * 2.循环迭代
 *   优点：代码运行效率好，因为时间只因循环次数增加而增加，而且没有额外的空间开销
 *   缺点：代码不如递归简介，可读性好
 *
 * @Author zfj
 * @create 2019/11/13 14:53
 */
public class tiguiANDdiedai {

    @Test
    public void Tjie(){
        long start=System.currentTimeMillis();
        System.out.println(f(30));//1346269
        long end=System.currentTimeMillis();
        System.out.println(end-start);// 40|667
    }
    public int f(int n){
        if(n<1)
            throw new IllegalArgumentException(n+"不能小于1");
        if(n==1||n==2)
            return n;
        return f(n-1)+f(n-2);
    }

    @Test
    public void test2(){
        long start=System.currentTimeMillis();
        System.out.println(f(30));//
        long end=System.currentTimeMillis();
        System.out.println(end-start);//17
    }

    public int loop(int n){
        if(n<1)
            throw new IllegalArgumentException(n+"不能小于1");
        if(n==1||n==2)
            return n;
        int one=2;//最后走一步
        int two=1;//最后走两步
        int sum=0;
        for(int i=3;i<=n;i++){
            sum=one+two;
            two=one;
            one=two;
        }
        return sum;
    }










}
