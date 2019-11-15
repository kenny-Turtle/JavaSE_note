package com.atguigu.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zfj
 * @create 2019/10/31 14:17
 */
public class ListExer {

    @Test
    public void testListRemove(){
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);

    }

    public static void updateList(List list){
//        list.remove(2);
        list.remove(new Integer(2));
    }
}
