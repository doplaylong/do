package com.itheima;

public class Test9 {
    public static void main(String[] args) {
        printX(9);
    }
    public static void printX(int i) {
        for (int a = 1; a <= i; a++) {
            for (int b = 1; b <= i; b++ ) {
                if (a >= b) {
                    System.out.print(b+"*"+ a +"="+ b * a + " \t");
                }
            }
            System.out.println();
        }
    }
}
