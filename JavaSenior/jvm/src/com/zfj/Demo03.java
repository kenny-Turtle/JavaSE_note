package com.zfj;

import java.util.ArrayList;

/**
 * @Author zfj
 * @create 2019/11/30 10:57
 */
//设置初始化内存大仙   设置最大分配内存
    //-XX:+PrintGCDetails //打印GC垃圾回收信息
//-Xms1m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError
public class Demo03 {
    byte[] arry=new byte[1*1024*1024];
    public static void main(String[] args) {
        ArrayList<Demo03> list=new ArrayList<>();
        int count=0;

        try{

            while(true){
                list.add(new Demo03());
                count=count+1;
            }
        }catch (Error e){
            System.out.println("count:"+count);
            e.printStackTrace();


        }

    }
}
