package com.atguigu.exer1;

import java.util.*;

/**
 * 定义泛型类DAO<T>，其中定义一个Map成员的键为String类型，值为T类型。
 *
 * 分别创建以下方法：
 * public void save(String id,T entity):保存T类型的对象到Map成员变量中
 * public T get(String id):从map中获取id对应的对象
 * public void update(String id,T entity):替换map中key为id的内容，改为entity对象
 * public List<T>list():返回map中存放的所有T对象
 * public void delete(String id):删除指定id的对象
 *
 * @Author zfj
 * @create 2019/11/4 14:42
 */
public class DAO<T> {

    private Map<String,T>map=new HashMap<>();

    //:保存T类型的对象到Map成员变量中
    public void save(String id,T entity){
        map.put(id,entity);
    }
    //:从map中获取id对应的对象
    public T get(String id){
        return map.get(id);
    }
    //:替换map中key为id的内容，改为entity对象
    public void update(String id,T entity){
        if(map.containsKey(id)){

            map.put(id,entity);
        }
    }
    //:返回map中存放的所有T对象
    public List<T> list(){
//        Collection<T> values = map.values();
        //正确的写法
        List<T> list=new ArrayList<>();
        Collection<T> values = map.values();
        for(T t:values){
            list.add(t);
        }
        return list;
    }
    //:删除指定id的对象

    public void delete(String id){
        map.remove(id);
    }







}
