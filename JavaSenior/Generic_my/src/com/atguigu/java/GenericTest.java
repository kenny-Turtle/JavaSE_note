package com.atguigu.java;

import org.junit.Test;

import java.util.*;

/**
 * 泛型的使用
 * 1.jdk5.0 新增的特性
 *
 * 2.在集合中使用泛型
 * 总结：
 *   1.集合接口或集合类在jdk5.0时都修改为带泛型的结构
 *   2.在实例化集合类时，可以指明具体的泛型类型
 *   3.指明完以后，在集合类或者接口中凡是定义类或接口时，内部结构（比如：方法、构造器、属性等）使用到类的泛型的位置
 *          都指定为实例化的泛型类型。
 *          比如：add(E e) ---->实例化以后：add(Integer e)
 *   4.注意点：泛型的类型必须是类，不能是基本数据类型。需要用到基本数据类型的位置，拿包装类
 *   5如果实例化时，没有指明泛型的类型。默认类型为java.lang.Object类型
 *
 *
 * 3.如何自定义泛型结构：泛型类、泛型接口、泛型方法  见GenericTest1.Java
 * @Author zfj
 * @create 2019/11/4 9:58
 */
public class GenericTest {


    //在集合中使用泛型之前的情况
    @Test
    public void test1(){
        List list=new ArrayList();
        //需求：存放学生成绩
        list.add(78);
        list.add(88);
        list.add(98);
        list.add(79);
        //问题一：类型不安全
//        list.add("tom");

        for(Object obj:list){
            //问题二：强转时，可能出现ClassCastException
            int stuScore = (Integer) obj;
            System.out.println(stuScore);
        }



    }
    //在集合中使用泛型的情况
    @Test
    public void test2(){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(78);
        list.add(77);
        list.add(76);
        list.add(75);
        //方式一
        for(Integer score:list){
            int stuScore=score;
            System.out.println(stuScore);
        }
        //方式二
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int stuScore=iterator.next();
            System.out.println(stuScore);
        }

    }

    //再集合中使用泛型的情况，以HashMap为例
    @Test
    public void test3(){
        Map<String,Integer> map=new HashMap<String, Integer>();
        map.put("Tom",78);
        map.put("Jom",78);
        map.put("Aom",78);
        Set<Map.Entry<String,Integer>> entry=map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> e = iterator.next();
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key+":"+value);


        }
    }





















}
