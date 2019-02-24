package com.itheima;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        Random r = new Random();
        int count = 0;
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(101);
            if (num != 0 && num != 101) {
                System.out.println(num);
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
