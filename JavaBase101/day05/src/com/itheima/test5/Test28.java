package com.itheima.test5;

public class Test28 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 15; i <= 500; i += 15) {
            System.out.print(i + "\t");
            count++;
            if (count % 5== 0) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("1-500 之内能同时被 3 和 5 整除的个数是: " + count);
    }
}
