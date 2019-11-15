package com.atguigu.Set;


import com.atguigu.java.User;
import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author zfj
 * @create 2019/10/31 15:22
 */
public class TreeSetTest {

    /*
    * 1.向TreeSet中添加的数据，要求是像同类的对象
    * 2.两中排序方式：自然排序（实现comparable接口）和定制排序（comparable）
    *
    * 3.自然排序中，比较两个对象是否相同的标准为：compareTo()返回0，不再是equals
    * 4.定制排序中，                           compare
    * */
    @Test
    public void test(){
        TreeSet set=new TreeSet();

//        set.add(123);
//        set.add(-123);
//        set.add(13);
//        set.add(23);

//        set.add("逢");
//        set.add("杰");
//        set.add("张");
//        set.add("A");

        set.add(new User("zfj",27));
        set.add(new User("zgj",26));
        set.add(new User("zfja",25));
        set.add(new User("kfj",23));
        set.add(new User("kfj",24));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test2(){
        Comparator com=new Comparator() {
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User&&o2 instanceof User){
                    User u1=(User)o1;
                    User u2=(User)o2;
                    return Integer.compare(u1.getAge(),u2.getAge());
                }else
                    throw new RuntimeException("输入的数据不匹配");
            }
        };
        TreeSet set=new TreeSet(com);
        set.add(new User("zfj",27));
        set.add(new User("zgj",26));
        set.add(new User("zfja",25));
        set.add(new User("kfj",23));
        set.add(new User("kfj",24));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }










}
