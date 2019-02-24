package com.itheima.demo11;
/*数组反转核心原理: 最远端换位置
        数组反转实现步骤:
        1.定义2个变量用于记录要换位置的小索引和大索引
        2.将小索引和大索引换位置
        3.小索引++,大索引--
        4.将小索引和大索引换位置

        小索引小于大索引就能换位置*/
public class demo11 {
    public static void main(String[] args) {
        int[] arr = new int[] {11, 22, 33 ,44 ,55};
        int start = 0;
        int end = arr.length -1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
