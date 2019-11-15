package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zfj
 * @create 2019/11/4 10:43
 */
public class Order<T> {

    String orderName;
    int orderId;

    //类的内部结构就可以使用类的泛型
    T orderT;
    public Order(){};

    public Order(String orderName,int orderId,T orderT){
        this.orderName=orderName;
        this.orderId=orderId;
        this.orderT=orderT;
    }

    //如下的三个方法，都不是泛型方法
    public T getOrderT(){
        return orderT;
    }
    public void setOrderT(T orderT){
        this.orderT=orderT;
    }

    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }
    //泛型方法：在方法中出现了泛型的结构，泛型参数与类的泛型参数没有任何关系
    //换句话说，泛型方法所属的类是不是泛型类都没有关系

    //下面时泛型方法
    public <E> List<E> copyFromArrayToList(E[] arr){
        ArrayList<E> list=new ArrayList<>();
        for(E e:arr){
            list.add(e);
        }
        return list;
    }







}
