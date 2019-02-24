package com.itheima.test5;

public class Test3 {
    public static void main(String[] args) {
        int[] nums = new int[] {5, 10 ,15};
        int[] newArr = new int[nums.length];
        System.out.println("nums数组:");
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i] * 2;
            newArr[i] = x;
            System.out.print(nums[i] +" ");
        }
        System.out.println();
        System.out.println("newArr数组:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
