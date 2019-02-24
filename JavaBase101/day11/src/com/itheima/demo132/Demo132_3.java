package com.itheima.demo132;

public class Demo132_3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = (int)Math.ceil(-10.8); i < Math.ceil(5.9); i++ ) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                count++;
            }
        }
        System.out.println("数量: " + count);
    }
}
