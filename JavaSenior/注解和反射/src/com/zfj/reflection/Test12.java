package com.zfj.reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * @Author zfj
 * @create 2019/11/27 16:30
 */
public class Test12 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("com.zfj.reflection.Student2");

        //通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        //获得注解的value值
        TableKuang tableKuang = (TableKuang) c1.getAnnotation(TableKuang.class);
        String value = tableKuang.value();
        System.out.println(value);
        //获得指定类注解
        Field f = c1.getDeclaredField("name");
        FieldKuang annotation = f.getAnnotation(FieldKuang.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());

    }

}

@TableKuang("db_student")
class Student2{
    @FieldKuang(columnName = "db_id",type = "int",length = 10)
    private int id;
    @FieldKuang(columnName = "db_name",type = "String",length = 10)
    private String name;
    @FieldKuang(columnName = "db_age",type = "int",length = 10)
    private int age;

    public Student2() {
    }

    public Student2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}

//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableKuang{
    String value();
}

//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface  FieldKuang{
    String columnName();
    String type();
    int length();
}