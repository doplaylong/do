package com.itheima.demo07;

import java.util.Scanner;

/*
    键盘录入一个字符串，统计字符串中大小写字母及数字字符个数
    RF2fd%#3SF&w2

    分析:
        1.创建Scanner对象
        2.使用Scanner对象的next方法获取字符串
        3.定义3个变量记录数量
        4.遍历字符串,获取每个字符
        5.如果是大写字母,大写字母数量+1
        6.如果是小写字母,小写字母数量+1
        7.如果是数字字符,数字字符数量+1
 */
public class Demo07_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String str = sc.next();
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch < '9') {
                numberCount++;
            }
        }
        System.out.println("大写字母: " + bigCount);
        System.out.println("小写字母: " + smallCount);
        System.out.println("数字字符: " + numberCount);
    }
}
