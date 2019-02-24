package com.itheima;

import java.util.Scanner;

//求三个数字的最大值
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数: ");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数: ");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数: ");
        int c = sc.nextInt();
        int temp = a > b ? a :b;
        int max = temp > c ? temp : c;
        System.out.println("最大值是: " + max);


    }
}
