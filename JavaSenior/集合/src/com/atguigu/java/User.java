package com.atguigu.java;

/**
 * @Author zfj
 * @create 2019/10/31 14:41
 */
public class User implements Comparable{
    private String name;
    private int age;

    public User() {
    }

    public boolean equals(Object o) {
        System.out.println("Use equals().......");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return name != null ? name.equals(user.name) : user.name == null;
    }

    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //按照姓名从小到大排序
    public int compareTo(Object o) {
        if(o instanceof User){
            User user=(User)o;
            return this.name.compareTo(user.name);
        }else{
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}
