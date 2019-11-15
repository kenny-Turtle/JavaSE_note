package com.atguigu.Collections;

import javafx.beans.binding.ObjectExpression;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Collections:操作Collection、map的工具类
 *
 *
 *reverse(List):反转List中元素的顺序
 * shuffle(List):对List集合元素进行随机排序
 * sort(List):根据元素的自然顺序对指定List集合元素按升序排序
 * sort(List,Comparator):根据指定的Comparator产生的顺序对 List集合进行排序
 * swap(List,int, int):将指定List集合元素中的i元素和j元素进行交换
 *
 * int frequency(Collection,Object):返回指定集合中指定元素的次数
 * void copy(List dest,List src):将src中的内容复制到dest中
 * boolean replaceAll(List list,Object oldvalue,Object newValue):使用新值替换久值
 *
 * @Author zfj
 * @create 2019/11/3 15:09
 */
public class CollectionsTest {
    @Test
    public void test1(){
        List list=new ArrayList();
        list.add(123);
        list.add(23);
        list.add(345);
        list.add(45);
        System.out.println(list);

//        List dest=new ArrayList();
        //正确的复制操作
        List dest= Arrays.asList(new Object[list.size()]);

        Collections.copy(dest,list);
        System.out.println(dest);
//        Collections.reverse(list);
//        Collections.shuffle(list);
//        Collections.sort(list);
//        int frequency = Collections.frequency(list,23);
//        System.out.println(frequency);

        /*
        * Collections类中提供了多个synchronizedXXX()方法，
        * 该方法可以使指定集合包装成线程同步的集合，从而可以解决多线程并发访问集合时的线程安全问题
        * */
        //返回的list即为线程安全的List
        List list1=Collections.synchronizedList(list);






    }
}
