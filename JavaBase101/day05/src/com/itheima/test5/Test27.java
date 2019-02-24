package com.itheima.test5;

public class Test27 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i = 2; i < arr.length; i += 2) {
            sum += i;
        }
        System.out.println("该数组的所有偶数和为: " + sum);
    }
}
