package com.zfj.se;

/**
 * @Author zfj
 * @create 2019/11/22 19:51
 */
public class tes {
    public static void main(String[] args) {
        Student s1=new Student();
        Person s2=new Student();
        //s1.run();
//        s1.eat();
//        s2.run();
        int[] arr=new int[]{43,32,76,-98,0,64,33,77,-23,45,-78,33,66,99,33,76};
        int[] ints = sort1(arr);
        for(int i:ints)
            System.out.print(i+" ");
    }

    public static int[] sort1(int[] array){
        int temp=0;
        for(int i=0;i<array.length-1;i++)
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        return array;
    }
}
