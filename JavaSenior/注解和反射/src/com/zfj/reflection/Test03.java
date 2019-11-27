package com.zfj.reflection;

/**
 * @Author zfj
 * @create 2019/11/21 16:22
 */
public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person=new Student();
        System.out.println("its:"+person.name);

        //方式一：通过对象获得
        Class c1=person.getClass();

        //方式二：forname获得
        Class c2=Class.forName("com.zfj.reflection.Student");

        //方式三：通过类名.class获得
        Class c3=Student.class;

        //获得父类类型
        Class c5=c1.getSuperclass();
        System.out.println(c5);
    }
}

class Person{
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Student extends Person{
    public Student(){
        this.name="学生";
    }
}
class Teacher extends Person{
    public Teacher(){
        this.name="老师";
    }
}
