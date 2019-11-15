package com.atguigu.exer1;

import java.util.List;

/**
 * @Author zfj
 * @create 2019/11/4 14:56
 */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User>dao=new DAO<>();

        dao.save("1001",new User(1001,34,"zfj"));
        dao.save("1002",new User(1002,34,"zfjjj"));
        dao.save("1003",new User(1003,34,"zfjjjjjj"));

//        System.out.println(list);
        dao.update("1003",new User(2003,23,"zzzz"));
        List<User> list = dao.list();

        list.forEach(System.out::println);
    }
}
