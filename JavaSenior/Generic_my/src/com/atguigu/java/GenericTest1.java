package com.atguigu.java;

import org.junit.Test;

import java.util.List;

/**
 * 如何自定义泛型结构：泛型类、泛型接口、泛型方法
 *
 * 1.关于自定义泛型类、泛型接口：
 * @Author zfj
 * @create 2019/11/4 10:46
 */
public class GenericTest1 {

    @Test
    public void test1(){
        //如果定义了泛型，但是实例化的时候没有指明类的泛型，则认为此泛型类型为Object类型
        //要求：如果大家定义了类的带泛型的，建议实例化时要指明类的泛型。
        Order order=new Order();
        order.setOrderT(123);
        order.setOrderT("acv");

        //建议：实例化时指明类的泛型
        Order<String>order1=new Order<>("orderAA",1001,"order0001");
        order1.setOrderT("AA:hello");
        order1.setOrderT("BB:world0");
        System.out.println(order1);

    }
    @Test
    public void test2(){
        SubOrder sub1=new SubOrder();
        //由于子类在继承带泛型的父类时，指明了泛型。则实例化子类对象时，不需要指明泛型
        sub1.setOrderT(1112);
        SubOrder1<String> sub2=new SubOrder1<>();
        sub2.setOrderT("order2");
    }
    //静态方法中不能使用类的泛型
//    public static void show(T orderT){
//        System.out.println(orderT);
//    }
    @Test
    public void test4(){
        Order<String> order=new Order<>();
//        Integer[] arr=new Integer[]{1,2,3,4};
        String[] arr=new String[]{"aa","bb"};
        //泛型方法在调用时，指明泛型参数的类型
        List<String> list = order.copyFromArrayToList(arr);
        System.out.println(list);
    }












}
