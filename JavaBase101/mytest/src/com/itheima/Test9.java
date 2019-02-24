package com.itheima;

import java.util.Scanner;

// 键盘输入一个字符串,统计其中各种字符出现的次数.
//种类有: 大写字母,小写字母,数字字符,其他
public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个任意字符串:");
        String input = sc.next();
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOhter = 0;
        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char ch = array[i];
            if (ch >= 'A' && ch <= 'Z') {
                countUpper++;
            } else if (ch >= 'a' && ch <= 'z') {
                countLower++;
            } else if (ch >= '0' && ch <= '9') {
                countNumber++;
            } else {
                countOhter++;
            }
        }
        System.out.println("countUpper = " + countUpper);
        System.out.println("countLower = " + countLower);
        System.out.println("countNumber = " + countNumber);
        System.out.println("countOther = " + countOhter);

    }
}
