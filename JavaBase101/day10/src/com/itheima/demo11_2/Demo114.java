package com.itheima.demo11_2;

import java.util.ArrayList;

/*
        定义方法,获取集合中所有的偶数元素
            返回值类型: 如果写int只能返回一个偶数,可能有多个偶数,
                        可以先将多个偶数放到ArrayList中,最后返回ArrayList
            参数列表: 获取哪个集合中的偶数不确定,ArrayList集合就作为参数
      */
public class Demo114 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(30);
        list.add(21);
        list.add(45);
        list.add(28);
        list.add(6);
        list.add(76);
        ArrayList<Integer> even = getEven(list);
        System.out.println("所有的偶数元素是: " + even);

    }
    public static ArrayList<Integer> getEven(ArrayList<Integer> l) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) % 2 == 0) {
                evenList.add(l.get(i));
            }
        }
        return evenList;
    }
}
