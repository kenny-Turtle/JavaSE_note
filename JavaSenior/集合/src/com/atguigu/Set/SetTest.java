package com.atguigu.Set;

import com.atguigu.java.User;
import com.atguigu.methodOfCollection.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 1.Set接口的框架：
 *
 * |----Collection接口：单列集合，用来存储一个一个的对象
 *    |----Set接口：存储无序，不可重复的数据  -->高中间的“集合”
 *            |----HashSet:作为Set接口的主要实现类：线程不安全的；可以存储null值
 *                 |----LinkedHashSet：作为HashSet的子类，遍历其内部数据时，可以按照添加时的顺序遍历
 *                      优点：对于频繁的遍历操作，LinkedHashSet效率高于HashSet
 *            |----TreeSet：可以按照添加对象的指定属性，进行排序
 *
 * 1.Set接口中没有额外定义的新的方法，使用的都是Collection中声明过的方法。
 *
 * @Author zfj
 * @create 2019/10/31 14:24
 */
public class SetTest {

    /*
    * 一、Set：存储无序不可重复的数据
    *   以HashSet为例说明
    *   1.无序性：不等于随机性。存储的数据在底层数组中并非按照数组索引的顺序添加，而是按照数据的哈希值进行添加
    *
    *
    *   2.不可重复性：保证添加的元素按照equals()判断时，不能返回true ，即，相同的元素只能添加一次。
    *
    * 二、添加元素的过程：以HashSet为例：
    *    我们向HashSet中添加元素a，首先调用元素a所在类的hashCode()方法，计算出元素a的哈希值，
    *     此哈希值接着通过某种算法计算出在HashSet底层数组中的存放位置（即为：索引位置），判断
    *     数组此位置上是否已经有元素：
    *         如果此位置上没有其他元素，则元素a添加成功
    *         如果此位置上有其他元素b（或以链表存在的多个元素），则比较元素a和元素b的hash值：
    *             如果hash值不相同，则元素a添加成功
    *             如果hash值相同，进而需要调用元素a所在类的equals方法：
    *                 equals返回true，元素a添加失败
    *                 equals返回false，则元素a添加成功
    *
    *
    *      对于添加成功的情况2和情况3而言：元素a于已经存在指定索引位置上数据以链表的方式存储。
    *       jdk7：元素a放到数组中，只向原来的元素
    *       jdk8：原来的元素在数组中，只向元素a
    *       总结：七上八下
    *
    *       HashSet底层：数组+链表的结构
    *
    *
    *
    *
    * */

    @Test
    public void test(){

        Set set=new HashSet();
        set.add(456);
        set.add(123);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new User("kenlamar",30));
        set.add(new User("kenlamar",30));
        set.add(129);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    //LinkedHash的使用
    //LinkedHash作为HashSet的子类，在添加数据的同时，每个数据还维护了两个引用，记录此数据前一个数据和有一个数据
    //优点：对于频繁的遍历操作，LinkedHashSet效率高于HashSet
    @Test
    public void test1(){
        Set set=new LinkedHashSet();
        set.add(456);
        set.add(123);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new User("kenlamar",30));
        set.add(new User("kenlamar",30));
        set.add(129);

        for(Object obj:set){
            System.out.println(obj);
        }

    }










}
