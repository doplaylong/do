package com.itheima;

public class demo081_2 {
    public static void main(String[] args) {
        short x = 20;
        short y = 30;
        System.out.println(compare(2,3));

        long m = 5L;
        long n =5L;
        System.out.println(compare(5,5));
    }
//    比较两个 byte 是否相等
    public static boolean compare(byte b1 , byte b2) {
        System.out.println("compare byte");
        return b1 == b2;
    }
//    比较两个 short 是否相等
    public static boolean compare(short b1 , short b2) {
        System.out.println("compare short");
        return b1 == b2;
    }
//    比较两个 int 是否相等
    public static boolean compare(int b1 , int b2) {
        System.out.println("compare int");
        return b1 == b2;
    }
//    比较两个 long 是否相等
    public static boolean compare(long b1 , long b2) {
        System.out.println("compare long");
        return b1 == b2;
    }
}
