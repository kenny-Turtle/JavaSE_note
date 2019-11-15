package com.atguigu.java;

import org.junit.Test;

/**
 * //输出100以内的质数
 * @Author zfj
 * @create 2019/11/4 15:05
 */
public class Zhishu {

    @Test
    public void test1(){

        long start = System.currentTimeMillis();

        for(int i=2;i<=100000;i++){
            boolean isFlag=true;

            for(int j=2;j<i;j++){

                if(i%j==0){
                    isFlag=false;

                }

            }
            if(isFlag){
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }

    //算法优化1
    @Test
    public void test2(){
        long start = System.currentTimeMillis();
        for(int i=2;i<=100000;i++){
            boolean isFlag=true;
            for(int j=2;j<i;j++){

                if(i%j==0){
                    isFlag=false;
                    break;//优化一
                }

            }
            if(isFlag){
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }


    //算法优化2
    @Test
    public void test3(){
        long start = System.currentTimeMillis();

        for(int i=2;i<=100000;i++){
            boolean isFlag=true;

            for(int j=2;j<=Math.sqrt(i);j++){

                if(i%j==0){
                    isFlag=false;
                    break;
                }

            }
            if(isFlag){
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

}
