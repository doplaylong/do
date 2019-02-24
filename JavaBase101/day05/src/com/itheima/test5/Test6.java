package com.itheima.test5;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1 };
        int start = 0;
        int end = arr.length - 1;
        boolean b = true;
        while (start <= end) {
            if (arr[start] != arr[end]) {
                b = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println( "{1,2,3,4,3,2,1}是否对称: "+ b );
    }
}
