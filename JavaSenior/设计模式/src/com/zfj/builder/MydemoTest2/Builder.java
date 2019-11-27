package com.zfj.builder.MydemoTest2;

/**
 * @Author zfj
 * @create 2019/11/25 19:30
 */
public abstract class Builder {
    abstract void buildAA(String msg);
    abstract void buildBB(String msg);
    abstract void buildCC(String msg);

    abstract Job getJob();
}
