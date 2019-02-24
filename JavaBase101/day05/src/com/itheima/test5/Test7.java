package com.itheima.test5;

public class Test7 {
    public static void main(String[] args) {
        boolean bb = equals();
        int[] arr1 = {1, 2, 3, 4, 3, 2, 1};
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.println(arr1[i] + "]");
            } else {
                System.out.print(arr1[i] + ", ");
            }
        }
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.println(arr1[i] + "]");
            } else {
                System.out.print(arr1[i] + ", ");
            }
        }
        System.out.println("是否一致: " + bb);
    }

    public static boolean equals() {
        int[] arr1 = {1, 2, 3, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 3, 2, 1};
        boolean b = true;
        if (arr1.length != arr2.length) {
            b = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    b = false;
                }
            }
        }
        return b;
    }
}