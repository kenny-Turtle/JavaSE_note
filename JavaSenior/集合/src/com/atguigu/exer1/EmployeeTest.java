package com.atguigu.exer1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 创建该类的5个对象，并把这些对象放入TreeSet集合中（：未学习：TreeSet需要使用泛型来定义）
 * 分别按照一下两种方式对集合中的元素进行排序，并遍历输出：
 *
 * 1.使Employee实现Comparable接口，并按name排序
 * 2.创建TreeSet时传入Comparator对象，按照生日日期的先后排序
 *
 * @Author zfj
 * @create 2019/10/31 18:37
 */
public class EmployeeTest {

    //问题一：使用自然排序
    @Test
    public void test1(){
        TreeSet set=new TreeSet();

        Employee e1=new Employee("liudehua",55,new MyDate(1982,2,3));
        Employee e2=new Employee("zhangxueyou",50,new MyDate(1983,5,3));
        Employee e3=new Employee("guofucheng",45,new MyDate(1983,2,1));
        Employee e4=new Employee("liming",56,new MyDate(1982,2,6));
        Employee e5=new Employee("liangchaowei",65,new MyDate(1982,8,3));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    //问题二，按照生日排
    @Test
    public void test2(){

        TreeSet set=new TreeSet(new Comparator() {
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee&&o2 instanceof Employee){
                    Employee e1= (Employee) o1;
                    Employee e2= (Employee) o2;

                    MyDate b1 = e1.getBirthday();
                    MyDate b2 = e2.getBirthday();
                    //比较年
                    int minusYear=b1.getYear()-b2.getYear();
                    if(minusYear!=0){
                        return minusYear;
                    }
                    int minusMonth=b1.getMonth()-b2.getMonth();
                    if(minusMonth!=0){
                        return minusMonth;
                    }
                    return b1.getDay()-b2.getDay();
                }
                throw new RuntimeException("传入的数据类型不一样");
            }
        });

        Employee e1=new Employee("liudehua",55,new MyDate(1982,2,3));
        Employee e2=new Employee("zhangxueyou",50,new MyDate(1983,5,3));
        Employee e3=new Employee("guofucheng",45,new MyDate(1983,2,1));
        Employee e4=new Employee("liming",56,new MyDate(1982,2,6));
        Employee e5=new Employee("liangchaowei",65,new MyDate(1982,8,3));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }














}
