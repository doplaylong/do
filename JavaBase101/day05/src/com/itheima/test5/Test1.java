package com.itheima.test5;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[] {12, 33, 25, 6, 16};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("数组最小值为: " + min);
    }
}
