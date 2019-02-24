package com.itheima.test06;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        String mgc = "奥巴马";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String str = sc.next();
        System.out.println(str.replace(mgc, "*"));
    }
}
