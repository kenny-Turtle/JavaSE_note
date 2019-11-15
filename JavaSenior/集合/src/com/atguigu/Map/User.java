package com.atguigu.Map;

/**
 * @Author zfj
 * @create 2019/11/1 14:03
 */
public class User implements Comparable{
    private String name;
    private int age;

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

    public User() {
    }

    public int compareTo(Object o) {
        if(o instanceof User){
            User user=(User)o;
            int compare=-this.name.compareTo(user.name);
            if(compare!=0){
                return compare;
            }
            else{
                return Integer.compare(this.age,user.age);
            }
        }else{
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}
