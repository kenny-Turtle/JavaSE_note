package com.atguigu.exer;

/**
 * @Author zfj
 * @create 2019/10/31 18:34
 */
public class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate() {
    }

    public int compareTo(MyDate b2) {

        int minusYear = this.getYear() - b2.getYear();
        if (minusYear != 0) {
            return minusYear;
        }
        int minusMonth = this.getMonth() - b2.getMonth();
        if (minusMonth != 0) {
            return minusMonth;
        }
        return this.getDay() - b2.getDay();
    }
}
