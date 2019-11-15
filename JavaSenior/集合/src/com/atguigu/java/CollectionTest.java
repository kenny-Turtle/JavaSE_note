package com.atguigu.java;

import org.junit.Test;

import java.util.*;

/**
 *
 * 一、集合框架的概述
 *
 * 1.集合、数组都是对多个数据进行存储操作的结构，简称Java容器。
 *   说明：此时的存储，主要是指内存层面的存储，不涉及到持久化（.txt,.jpg,.avi，数据库）
 *
 * 2.1数组在存储多个数据方面的特点：
 *      》一旦初始化以后，其长度就确定了。
 *      》一旦定义好，其元素的类型也就确定好，我们也就只能操作指定类型的数据了
 *          比如：String[] arr; int[] arr1;Object[] arr2;
 * 2.2数组在寻相互多个数据方面的缺点：
 *      》一旦初始化以后，其长度就确定不能修改了
 *      》数组中提供的方法非常有限，对于添加、删除、插入数据等操作，非常不便，同时效率不高。
 *      》获取数组中实际元素的个数的需求，数组没有现成的属性或方法可用
 *      》数组存储数据的特点：有序、可重复。对于无序、不可重复的需求，不能满足。
 *
 * 二、集合框架
 *      |----Collection接口：单列数据，用来存储一个一个的对象
 *          |----List接口：存储有序，可重复的数据。 --> “动态”数组
 *              |----ArrayList,LinkedList,Vector
 *
 *          |----Set接口：存储无序，不可重复的数据  -->高中间的“集合”
 *              |----HashSet,LinkedHashSet,TreeSet
 *
 *      |----Map接口：双列集合用来存储一对（键值对）的数据
 *          |----HashMap,LinkedHapMap,TreeMap,Hashtable,Properties
 *
 *三、Collectoin接口中的方法的使用
 *
 *
 * @Author zfj
 * @create 2019/10/30 14:12
 */
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll=new ArrayList();

        //add(Object e):将元素e添加到集合coll中
        coll.add("AA");
        coll.add("BB");
        coll.add("123");//自动装箱
        coll.add(new Date());
        System.out.println(coll.size());

        //addAll():
        Collection coll1=new ArrayList();
        coll1.add(456);
        coll1.add("CC");
        coll.addAll(coll1);

        System.out.println(coll.size());
        System.out.println(coll);

        //clear:清空集合元素

        //isEmpty: 判断当前集合是否为空
        System.out.println(coll.isEmpty());

    }

    //练习：在list内取出重复数字值，要求尽量简单
    public static List duplicateList(List list){
        HashSet set=new HashSet();
        set.addAll(list);
        return new ArrayList(set);
    }

    @Test
    public void test2(){
        List list=new ArrayList();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(2));
        list.add(new Integer(4));
        list.add(new Integer(4));
        List list2=duplicateList(list);
        for(Object o:list2){
            System.out.println(o);
        }

    }

    @Test
    public void test3(){
        HashSet set=new HashSet();
        Person p1=new Person(1001,"AA");
        Person p2=new Person(1002,"BB");

        set.add(p1);
        set.add(p2);
        p1.name="CC";
        set.remove(p1);
        System.out.println(set);
        set.add(new Person(1001,"CC"));
        System.out.println(set);
        set.add(new Person(1001,"AA"));
        System.out.println(set);
    }













}
