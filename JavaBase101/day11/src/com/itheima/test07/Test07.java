package com.itheima.test07;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个QQ号码: ");
        String qq = sc.next();
        checkQQ(qq);
        System.out.println("这个QQ号码是否正确: " + checkQQ(qq));

    }
    public static boolean checkQQ(String qq) {
        if (qq.length() < 5 || qq.length() > 12) {
            return false;
        }
        if (qq.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            if (qq.charAt(i) < '0' || qq.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
