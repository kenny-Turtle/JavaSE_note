package com.atguigu.java1;

import org.junit.Test;

import java.util.List;

/**
 * @Author zfj
 * @create 2019/11/4 14:13
 */
public class DAOTest {
    @Test
    public void test1(){
        CustomerDAO dao1=new CustomerDAO();
        dao1.add(new Customer());
        List<Customer> list=dao1.getForList(10);
    }
}
