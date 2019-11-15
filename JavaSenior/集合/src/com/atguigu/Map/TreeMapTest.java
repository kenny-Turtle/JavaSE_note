package com.atguigu.Map;

import org.junit.Test;

import java.util.*;

/**
 * @Author zfj
 * @create 2019/11/1 13:59
 */
public class TreeMapTest {

    /*
    * 向TreeMap中添加key-value,要求key必须是由同一个类创建的对象
    * 因为要按照key排序：自然排序、定制排序
    * */


    //自然排序
    @Test
    public void test1(){
        TreeMap map=new TreeMap();


        User u1=new User("Tom",23);
        User u2=new User("Rom",24);
        User u3=new User("Wom",25);
        User u4=new User("Vom",26);
        map.put(u1,98);
        map.put(u2,97);
        map.put(u3,96);
        map.put(u4,95);

        Set entrySet=map.entrySet();
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Object obj=iterator.next();
            Map.Entry entry=(Map.Entry)obj;
            System.out.println(entry.getKey()+"----->"+entry.getValue());
        }
    }
    //定制排序
    @Test
    public void test2(){
        TreeMap map=new TreeMap(new Comparator() {
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User&&o2 instanceof User){
                    User u1=(User)o1;
                    User u2=(User)o2;
                    return Integer.compare(u1.getAge(),u2.getAge());
                }
                else
                    throw new RuntimeException("输入的类型不匹配");
            }
        });


        User u1=new User("Tom",23);
        User u2=new User("Rom",24);
        User u3=new User("Wom",25);
        User u4=new User("Vom",26);
        map.put(u1,98);
        map.put(u2,97);
        map.put(u3,96);
        map.put(u4,95);

        Set entrySet=map.entrySet();
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Object obj=iterator.next();
            Map.Entry entry=(Map.Entry)obj;
            System.out.println(entry.getKey()+"----->"+entry.getValue());
        }
    }
}
