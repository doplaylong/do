package com.itheima.test5;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = new int[] {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        int avg =getAvg(arr);
        int count = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > avg) {
                count++;
            }
            i++;
        }
        System.out.println("高于平均分: " + avg +"的个数有" + count +"个");
    }
    public static int getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum  += arr[i];
        }
        return  sum / arr.length;
    }
}
