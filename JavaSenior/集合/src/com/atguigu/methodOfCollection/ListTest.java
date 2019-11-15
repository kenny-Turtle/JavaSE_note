package com.atguigu.methodOfCollection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 1.List接口框架
 * |----Collection接口：单列数据，用来存储一个一个的对象
 *            |----List接口：存储有序，可重复的数据。 --> “动态”数组,替换原有的数组
 *                |----ArrayList：作为List接口的主要实现类；线程不安全，效率高；底层使用Object[] elementData存储
 *                |----LinkedList：对于频繁的插入、删除操作，使用此类效率比ArrayList高；底层使用双向链表存储
 *                |----Vector：作为List接口的古老实现类；线程安全，效率低；底层使用Object[] elementData存储
 *
 *
 * 2.    ArrayList源码分析：
 *
 *   2.1 jdk7情况下
 *          ArrayList list=new ArrayList();底层创建了长度是10的Object[]数组elementData
 *          list.add(123);//elementData[0]=new Integer(123);
 *          ...
 *          list.add(11);//如果此次的添加导致底层elementData数组容量不够，则扩容。
 *          默认情况下，扩容为原来的容量的1.5倍，同时需要将原有的数组中的数据复制到新的数组中。
 *
 *          结论：建议开发中使用带参的构造器：ArrayList arr=new ArrayList(int capacity)
 *
 *
 *
 *   2.2 jdk 8中ArrayList的变化
 *          ArrayList list=new ArrayList();//底层Object[] elementData初始化为{}，并没有创建长度为10的数组
 *
 *          list.add(123);//第一次调用add()时，底层才创建长度10的数组，并将数据123添加到elementData中
 *
 *   2.3 小结：jdk7中的ArrayList的创建类似于单例模式中的饿汉式，而jdk8中的ArrayList的创建类似于单例模式中的懒汉式。
 *
 * 3.   LinkedList的源码分析：
 *
 *     LinkedList list=new LinkedList(); 内部声明了Node类型的first和last属性，默认值为null
 *      list.add（123）；//将123封装到Node中，创建Node对象
 *
 *        其中，Node定义为：体现了LiskedList双向链表的说法
 *        private static class Node<E>{
 *            E item;
 *            Node<E> next;
 *            Node<E> prev;
 *
 *            Node(Node<E> prev,E element,Node<E> next){
 *            this.item=element;
 *            this.next=next;
 *            this.prev=prev;
 *            }
 *        }
 *
 *  4Vector的源码分析：通过Vector()构造器创建对象时，底层创建了长度为10的数组，扩容时，长度变为原来的两倍
 *
 *
 *
 * 面试题：ArrayList,linkedList,vector三者的异同？
 *  同：三个类都是实现了List接口，存储数据的特点相同：存储有序的，可重复的数据
 *  不同：见上
 *
 *
 *  5. List接口中的常用方法
 *
 *
 *
 *
 * @Author zfj
 * @create 2019/10/30 18:26
 */
public class ListTest {
    /*
    * void add(int index,Object ele):在index位置插入ele元素
    * boolean addAll(int index,Collection eles):从index位置开始将else中的所有元素添加进来
    * Object get(int index);获取指定index位置的元素
    * int indexOf(Object obj):返回obj在集合中首次出现的位置
    * int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
    * Object remove(int index):移除index位置的元素，并返回此元素
    * Object set(int index,Object ele):设置指定index位置的元素ele
    * List subList(int fromIndex,int toIndex):返回从fromIndex到ToIndex位置的子集合 （左闭右开）
    *
    *  总结：常用方法
    *    增：add(Object obj)
    *    删：remove(int index) / remove(Object obj)
    *    改：set(int index,Object ele)
    *    查：get(int index)
    *    插：add(int index,Object ele)
    *    长度：size
    *    遍历：(1)Iterator迭代器方式
    *          (2)增强for循环
    *          3 普通的循环
    * */


    @Test
    public void test3(){
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(456);
        list.add(new Person("Jerry",20));
        list.add(false);

//        list.remove(0);
        list.set(0,1233);
        list.add(1,345);
//        System.out.println(list);
        Iterator iterator = list.iterator();
        /*while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        System.out.println();
        for(Object obj:list){
            System.out.println(obj);
        }
    }






}
