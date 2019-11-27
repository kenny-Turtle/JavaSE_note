package com.zfj.builder.MydemoTest2;

/**
 * @Author zfj
 * @create 2019/11/25 19:34
 */
public class Test {
    public static void main(String[] args) {

        Worker work=new Worker();
//        work.buildAA("修改");
        Job job = work.getJob();
        System.out.println(job.toString());

    }
}
