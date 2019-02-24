package com.itheima.demo08;

public class demo08_2 {
    public static void main(String[] args) {
       /* 什么是数组遍历(重点):
        就是依次拿到数组中的每个元素*/
//        原始方法:
       /* System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);*/
//      代码重复,说明可以使用循环
        int[] arr = new int[] {25, 64, 79, 49, 48, 78, 45, 96};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("*************************************");

        for (int i = 0; i <= arr.length-1; i++) {
            System.out.println(arr[i]);
        }
    }
}
