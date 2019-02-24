package com.itheima.demo032_2;

import java.util.Scanner;

/*
    键盘录入三个int数据并获取最大值

    分析:
        1.创建Scanner对象
        2.使用Scanner对象的nextInt方法获取3个int数据
        3.使用三元运算符先获取前面2个数的最大值
        4.在使用三元运算符拿前两个数的较大值和第三个数比较获取最大值
 */
public class demo032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据: ");
        int i = sc.nextInt();
        System.out.println("请输入第一个数据: ");
        int j = sc.nextInt();
        System.out.println("请输入第一个数据: ");
        int k = sc.nextInt();
        int temp = i > j ? i : j;
        int max = temp > k ? temp : k;
        System.out.println("最大值为: " + max);
    }
}
