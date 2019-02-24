package com.itheima.demo09;
/*
    什么是数组反向遍历(较少): 从后往前打印所有元素
 */
//  arr.forr: 反向遍历
public class demo10_3 {
    public static void main(String[] args) {
      int[] arr = {100, 200, 300, 400 ,500};
      for(int i = arr.length - 1; i >= 0; i--) {
          System.out.println(arr[i]);

      }
    }
}
