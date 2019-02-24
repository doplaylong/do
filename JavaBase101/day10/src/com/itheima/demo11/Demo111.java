package com.itheima.demo11;

import java.util.ArrayList;
import java.util.Random;

/*
    生成6个1~33之间的随机整数,添加到ArrayList集合,并遍历

    分析:
        1.创建ArrayList集合
        2.创建Random对象
        3.使用for循环6次
        4.在循环中使用Random对象生成随机数
        5.将随机数添加到ArrayList集合中
        6.遍历ArrayList集合
 */
public class Demo111 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
