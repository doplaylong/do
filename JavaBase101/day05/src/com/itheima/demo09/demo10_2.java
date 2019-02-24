package com.itheima.demo09;
/*
    什么是数组反向遍历(较少): 从后往前打印所有元素
 */
//  arr.forr: 反向遍历
public class demo10_2 {
    public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
