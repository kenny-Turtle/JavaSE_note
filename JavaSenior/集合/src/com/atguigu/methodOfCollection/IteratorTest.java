package com.atguigu.methodOfCollection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合元素的遍历操作，使用迭代器dIterator接口
 *1.内部的方法：hasNext() 和 next();
 *2.集合对象每次调用iterator()方法都会得到一个全新的迭代器对象，默认游标都在集合的第一个元素之前
 *3.内部定义了remove()，可以在便利的时候，删除集合中的元素。此方法不同于集合直接调用remove()
 *
 * @Author zfj
 * @create 2019/10/30 17:23
 */
public class IteratorTest {

    @Test
    public void test1(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        Iterator iterator = coll.iterator();

//        System.out.println(iterator.next());
        /*for(int i=0;i<coll.size();i++){
            System.out.println(iterator.next());
        }*/
        //最佳方式
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
    @Test
    public void test2(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        //错误方式 死循环，一直输出123
//        while(coll.iterator().hasNext()){
//            System.out.println(coll.iterator().next());
//        }

    }

    @Test
    public void test3(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        Iterator iterator = coll.iterator();
        while(iterator.hasNext()){
            Object obj=iterator.next();
            if("Tom".equals(obj)){
                iterator.remove();
            }
        }

        //再遍历集合
        iterator = coll.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }




}
