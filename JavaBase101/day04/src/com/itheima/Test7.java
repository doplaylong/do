package com.itheima;

public class Test7 {
    public static void main(String[] args) {
        System.out.println("四舍五入是:"+ round(13.7));
    }
    public static int round(double a) {
        if ((int)(a + 0.5) == (int)a ) {
            return (int)a;
        } else {
            return (int)(a + 0.5 );
        }
    }
}
