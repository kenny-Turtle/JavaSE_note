package com.itzfj.JavaSE;

import org.junit.Test;

/**
 * 饿汉式：
 *   直接创建实例对象，不管你是否需要这个对象
 *
 *  1.构造器私有化
 *  2.自行创建，并且用静态变量保存
 *  3.向外提供这个实例
 *  4.强调这是一个单例，我们可以用final修改
 * @Author zfj
 * @create 2019/11/13 11:59
 */
public class single {
    public static final single INSTANCE=new single();
    private single(){

    }
}

