package com.itheima.demo032_3;

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
        int a = sc.nextInt();
        System.out.println("请输入第二个数据: ");
        int b = sc.nextInt();
        System.out.println("请输入第三个数据: ");
        int c = sc.nextInt();
        int temp = a > b ? a : b;
        int max = temp > c ? temp : b;
        System.out.println("最大值为: " + max);
    }
}
