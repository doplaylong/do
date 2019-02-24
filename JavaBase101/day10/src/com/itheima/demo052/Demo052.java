package com.itheima.demo052;

import java.util.Random;
import java.util.Scanner;

/*
注意:
    Scanner类中有nextInt方法,Random类也有nextInt方法,这两个方法含义不一样.

猜数字小游戏
    游戏开始时，会随机生成一个1-100之间的整数 number 。玩家猜测一个数字 guessNumber ，会与 number 作比
    较，系统提示大了或者小了，直到玩家猜中，游戏结束。

    分析:
        1.创建Rnadom对象
        2.使用Rnadom对象生成一个1-100之间的整数 number
        3.提示用户输入一个数字
        4.创建Scanner对象
        5.使用Scanner对象的nextInt方法获取用户输入的数据 guessNumber
        6.如果用户输入的guessNumber 大于了随机数number,提示用户大了
        7.如果用户输入的guessNumber 小于了随机数number,提示用户小了
        8.其他不大步小就是猜中了
 */
public class Demo052 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {  //循环次数未知用while ,而且是死循环
            System.out.println("请输入你要猜的数字[1, 100]: ");
            int guessNumber = sc.nextInt();
            if (guessNumber > number) {
                System.out.println("您猜大了,请重猜");
            } else if (guessNumber < number) {
                System.out.println("您猜小了,请重猜");
            } else {
                System.out.println("恭喜您猜中了!");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}
