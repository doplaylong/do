package com.itheima;

public class Test3 {
    public static void main(String[] args) {
        int length = 20;
        int width = 8;
        int zc = getPerimeter(20,8);
        System.out.println("长方形周长:" + zc);
        int area = getArea(20,8);
        System.out.println("长方形面积:" + area);
    }
    public static int getPerimeter(int length,int width) {
        return (length + width ) * 2;
    }
    public static int getArea(int length,int width) {
        return length * width;
    }
}

