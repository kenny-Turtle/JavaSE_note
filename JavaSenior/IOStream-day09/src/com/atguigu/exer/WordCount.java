package com.atguigu.exer;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 练习：获取文本上字符出现的次数，把数据写入文件
 *
 * 思路：
 * 1.遍历文本每一个字符
 * 2.字符出现的次数存在Map里
 *
 * Map<Character,Integer> map=new HashMap<Character,Integer>();
 * map.put('a',18);
 * map.put('数',2);
 *
 * 3.把map中的数据写入文件
 *
 * @Author zfj
 * @create 2019/10/29 12:55
 */
public class WordCount {
    @Test
    public void testWordCount(){
        FileReader fr= null;
        BufferedWriter bw= null;
        try {
            //1.创建map集合
            Map<Character,Integer> map=new HashMap<Character, Integer>();

            //2.遍历每一个字符，每一个字符出现的次数放到map中
            fr = new FileReader("zfj.txt");
            int c=0;
            while((c=fr.read())!=-1){
                //int还原char
                char ch=(char) c;
                //判断char是否在map中第一次出现
                if(map.get(ch)==null){
                    map.put(ch,1);
                }else{
                    map.put(ch,map.get(ch)+1);
                }
            }
            //3.将map中的数据存到文件count.txt
            //3.1创建writer
            bw = new BufferedWriter(new FileWriter("WorkCount.txt"));

            //3.2遍历map，再写入数据
            Set<Map.Entry<Character,Integer>> entrySet=map.entrySet();
            for(Map.Entry<Character,Integer>entry:entrySet){
                switch(entry.getKey()){
                    case ' ':
                        bw.write("空格="+entry.getValue());
                        break;
                    case '\t':
                        bw.write("tab键="+entry.getValue());
                        break;
                    case '\r':
                        bw.write("回车="+entry.getValue());
                        break;
                    case '\n':
                        bw.write("换行="+entry.getValue());
                        break;
                    default:
                        bw.write(entry.getKey()+"="+entry.getValue());
                        break;
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if(fr!=null){

                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        //4










    }
}
