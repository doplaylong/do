package com.itheima.demo11_3;

import java.util.ArrayList;

/*
        定义一个方法,按指定格式打印ArrayList集合中的内容: {元素@元素@元素}
            返回值类型: void
            参数列表: 打印哪个集合中的内容不确定,ArrayList集合作为参数
      */
public class Demo113 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        printArrayList(list);

    }
    public static void printArrayList(ArrayList<String> l) {
        System.out.print("{");
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i));
            if (i == l.size() - 1) {
                System.out.print("}");
            } else {
                System.out.print("@");
            }
        }
    }
}
