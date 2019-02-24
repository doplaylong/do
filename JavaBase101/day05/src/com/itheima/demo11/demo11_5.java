package com.itheima.demo11;
/*数组反转核心原理: 最远端换位置
        数组反转实现步骤:
        1.定义2个变量用于记录要换位置的小索引和大索引
        2.将小索引和大索引换位置
        3.小索引++,大索引--
        4.将小索引和大索引换位置

        小索引小于大索引就能换位置*/
public class demo11_5 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50, 60};
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}