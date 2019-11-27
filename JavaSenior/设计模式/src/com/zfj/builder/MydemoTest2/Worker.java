package com.zfj.builder.MydemoTest2;

/**
 * @Author zfj
 * @create 2019/11/25 19:32
 */
public class Worker extends Builder {
    private Job job;

    public Worker() {
        job=new Job();
    }



    void buildAA(String msg) {
        job.setProA(msg);
    }

    void buildBB(String msg) {
        job.setProB(msg);
    }

    void buildCC(String msg) {
        job.setProC(msg);
    }

    Job getJob() {
        return job;
    }
}
