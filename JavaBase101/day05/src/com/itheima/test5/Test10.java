package com.itheima.test5;

public class Test10 {
    public static void main(String[] args) {
        int[] arr = {99, 100, 98, 97, 96, 96, 85, 92};
        System.out.println("最终得分: " + getAvg(arr));
    }  
    public static int getAvg(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        int avg = (sum - max - min) / (a.length - 2);
        return avg;
    }
}
