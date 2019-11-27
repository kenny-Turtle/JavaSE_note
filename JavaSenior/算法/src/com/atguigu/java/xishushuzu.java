package com.atguigu.java;

/**
 * @Author zfj
 * @create 2019/11/23 9:17
 */
public class xishushuzu {
    public static void main(String[] args) {
        //1,创建二维数组
        int[][] arr=new int[11][11];
        arr[1][2]=1;
        arr[2][3]=2;
        //输出原始数组
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
        System.out.println("=======================================================");
        //转成稀疏数组保存
        //获取有效值的个数
        int sum=0;
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(arr[i][j]!=0)
                    sum++;
            }
        }
        System.out.println("有效值个数 "+sum);
        int[][] arr2=new int[sum+1][3];

        arr2[0][0]=11;
        arr2[0][1]=11;
        arr2[0][2]=sum;
        //遍历二维数组，将非零的值，存放在稀疏数组中
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[i][j]!=0){
                    count++;
                    arr2[count][0]=i;
                    arr2[count][1]=j;
                    arr2[count][2]=arr[i][j];
                }
            }
        }

        System.out.println("输出稀疏数组");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i][0]+" "+arr2[i][1]+" "+arr2[i][2]);
            System.out.println();
        }

        System.out.println("===================================");
        int[][] arr3=new int[arr2[0][0]][arr2[0][1]];
        for(int i=1;i<arr2.length;i++){
                arr3[arr2[i][0]][arr2[i][1]]=arr2[i][2];
        }
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("==========================");
        for (int[] ints : arr3) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }

    }
}
