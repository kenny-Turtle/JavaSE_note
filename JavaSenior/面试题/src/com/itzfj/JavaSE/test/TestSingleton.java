package com.itzfj.JavaSE.test;

import com.itzfj.JavaSE.Singleton2;
import com.itzfj.JavaSE.Singleton4;
import com.itzfj.JavaSE.single;

import java.sql.SQLOutput;
import java.util.concurrent.*;

/**
 * @Author zfj
 * @create 2019/11/13 12:08
 */
public class TestSingleton {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        single s=single.INSTANCE;
//        System.out.println(s);
//        Singleton2 ss=Singleton2.INSTANCE;
//        System.out.println(ss);
//        Singleton4 s4=Singleton4.getInstance();
//        Singleton4 s5=Singleton4.getInstance();
//        System.out.println(s4);
//        System.out.println(s5);

        Callable<Singleton4> c=new Callable<Singleton4>() {
            public Singleton4 call() throws Exception {
                return Singleton4.getInstance();
            }
        };
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton4> f1 = es.submit(c);
        Future<Singleton4> f2 = es.submit(c);

        Singleton4 s1 = f1.get();
        Singleton4 s2 = f2.get();

        System.out.println(s1==s2);
        System.out.println(s1);
        System.out.println(s2);
        es.shutdown();
    }

}
