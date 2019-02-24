package com.itheima;

public class Test11 {
    public static void main(String[] args) {
        double min =Math.ceil(-10.8);
        double max = 5.9;
        int count = 0;
        for (double i= min; i < max; i++) {
            double abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
