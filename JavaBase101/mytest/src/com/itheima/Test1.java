package com.itheima;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[] {10, 20, 30, 40, 50};
        System.out.println(arr);
        System.out.println(arr.length);
        System.out.println(arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

//        打印为[10, 20 ,30, 40, 50]
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(Arrays.toString(arr));
    }
}
