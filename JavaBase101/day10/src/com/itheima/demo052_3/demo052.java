package com.itheima.demo052_3;

import java.util.Random;
import java.util.Scanner;

public class demo052 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入您猜的数字: ");
            int guessNumber = sc.nextInt();
            if (guessNumber > number) {
                System.out.println("您猜大了,请重猜! ");
            } else if (guessNumber < number) {
                System.out.println("您猜小了,请重猜! ");
            } else {
                System.out.println("恭喜您猜中了! ");
                System.out.println("游戏结束! ");
                break;
            }
            count++;
        }
        if (count >= 5) {
            System.out.println("很遗憾您超过5次猜错,游戏失败! ");
        }
    }
}
