package com.zfj.prototype.demo02;

import java.util.Date;

/**
 * @Author zfj
 * @create 2019/11/25 22:28
 *
 *
 *
 */
public class Video implements Cloneable{//无良up主，克隆别人的视频
    private String name;
    private Date createTime;

    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Video(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    public Video() {
    }

    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();

        Video v=(Video) obj;
        v.createTime = (Date) this.createTime.clone();
        return super.clone();
    }
}
