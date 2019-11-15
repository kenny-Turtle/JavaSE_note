package com.atguigu.java1;

import java.util.List;

/**
 * @Author zfj
 * @create 2019/11/4 14:08
 *
 * DAO:data(base)access object
 */
public class DAO<T> {

    //添加一条记录
    public void add(T t){

    }
    //删除一条记录

    //修改一条记录

    //查询一条记录

    //查询多条记录
    public List<T> getForList(int index){

        return null;
    }
    //泛型方法
    //举例：获取表中一共有多少记录？获取最大的员工入职时间
    public <E> E getValue(){

        return null;
    }
}
