package com.atguigu.java;

import org.junit.Test;

/**
 * 使用二维数组打印一个10行的杨辉三角.
 *
 * @Author zfj
 * @create 2019/11/4 18:38
 */
public class YangHuiTest {

    @Test
    public void test1(){
        //1.声明并初始化数组
        int[][] yanghui=new int[10][];
        //2.给数组的元素赋值
        for(int i=0;i<10;i++){
            yanghui[i]=new int[i+1];
            //2.1给首末元素赋值
            yanghui[i][0]=1;
            yanghui[i][i]=1;
            //2.2给每行的非首末元素赋值
            //if(i>1){
                for(int j=1;j<yanghui[i].length-1;j++){
                    yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
                }
            //}

        }

        //3.遍历二维数组
        for(int i=0;i<yanghui.length;i++){
            for(int j=0;j<yanghui[i].length;j++){
                System.out.print(yanghui[i][j]+" ");
            }
            System.out.println();
        }
    }

}
