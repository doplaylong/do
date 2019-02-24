package com.itheima;

import java.util.Random;
import java.util.Scanner;

//猜数字游戏
public class Test7 {
    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt(101);
        Scanner sc = new Scanner(System.in);
 /*       while (true) {
            System.out.println("请猜测一个数字: ");
            int s = sc.nextInt();
            if (s < r) {
                System.out.println("数字太小了,请重猜");
            } else if (s > r) {
                System.out.println("数字太大了,请重猜");
            } else {
                System.out.println("恭喜你,猜对了!");
                break;
            }
        }
        System.out.println("游戏结束!");  */
        int count = 0;
        for (int i = 0; i <= 5; i++) {
            System.out.println("请猜测数字: ");
            int s = sc.nextInt();
            if (s < r) {
                System.out.println("数字太小了,请重猜");
            } else if (s > r) {
                System.out.println("数字太大了,请重猜");
            } else {
                System.out.println("恭喜你,猜对了!");
                break;
            }
            count++;
        }
        if (count > 5) {
            System.out.println("已超出次数,游戏结束");
        } else {
            System.out.println("游戏结束!");
        }
    }
}
