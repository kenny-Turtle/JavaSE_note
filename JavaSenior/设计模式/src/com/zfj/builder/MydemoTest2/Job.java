package com.zfj.builder.MydemoTest2;

/**
 * @Author zfj
 * @create 2019/11/25 19:31
 */
public class Job {
    private String proA="第一战";
    private String proB="第二战";
    private String proC="第三战";

    public String toString() {
        return "Job{" +
                "proA='" + proA + '\'' +
                ", proB='" + proB + '\'' +
                ", proC='" + proC + '\'' +
                '}';
    }

    public String getProA() {
        return proA;
    }

    public void setProA(String proA) {
        this.proA = proA;
    }

    public String getProB() {
        return proB;
    }

    public void setProB(String proB) {
        this.proB = proB;
    }

    public String getProC() {
        return proC;
    }

    public void setProC(String proC) {
        this.proC = proC;
    }
}
