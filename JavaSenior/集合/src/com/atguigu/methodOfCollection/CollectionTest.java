package com.atguigu.methodOfCollection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 *
 * Collection接口中声明的方法的测试
 *
 * 向collection接口中的实现类中的对象中添加数据obj时，要求obj所在的类重写equals
 *
 * @Author zfj
 * @create 2019/10/30 15:37
 */
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry",20));
        //coll.add(p);

        //contains(Object obj):判断当前集合中是否包含obj
        boolean contains=coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("Tom")));
//        System.out.println(coll.contains(p));
        System.out.println(coll.contains(new Person("Jerry",20)));
    }

    @Test
    public void test2(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);
        //retainAll():获取两个集合的交集
//        Collection coll1=new Arrays.asList(123,456,789);
        Collection coll1=Arrays.asList(123,456,789);
        coll.retainAll(coll1);
        System.out.println(coll);

    }

    @Test
    public void test4(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        //hashCode():放回当前对象的哈希值
        System.out.println(coll.hashCode());


        //集合---》数组 toArray();
        Object[] arr=coll.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(arr[0]);


        //拓展  数组---》集合
        /*List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(list);*/

        //iterator():返回Iterator接口的实例，用于遍历集合元素

    }







}
