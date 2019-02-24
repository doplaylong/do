package com.itheima.test3;

import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int num = r.nextInt(10) + 1;
            System.out.println(num);
        }
    }
}
