package com.atguigu.java2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 1.泛型在继承方面的体现
 *      类A时类B的父类，G<A>和G<B>二者不具备子父类关系，二至时并列关系
 *                    但A<G>和B<G> 是父子类关系
 * 2.通配符的使用
 *      类A时类B的父类，G<A>和G<B>二者不具备子父类关系,但是其共同父类 G<?>
 * @Author zfj
 * @create 2019/11/4 14:21
 */
public class GenericTest {


    @Test
    public void test1(){
        Object obj=null;
        String str=null;
        obj=str;


        List<Object> list1=null;
        List<String> list2=null;

        //此时的list1和list2不具备字符类的关系
//        list1=list2;

    }

    @Test
    public void test2(){
        List<Object> list1=null;
        List<String> list2=null;

        List<?> list=null;
        list=list1;
        list=list2;
//        print(list1);
//        print(list2);
        //对于List<?>  就不能向其内部添加数据。
        //除了添加null
        List<String> list3=new ArrayList<>();
        list3.add("AA");
        list3.add("bb");
        list3.add("cc");
        list=list3;

        list.add(null);
        Object o = list.get(0);
        System.out.println(o);


    }

    public void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }











}
