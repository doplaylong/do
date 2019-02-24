package com.itheima;

public class Test4 {
    public static void main(String[] args) {
        char aChar = getChar(100);
        System.out.println("字符: "+ aChar);
    }
    public static char getChar(int num) {
        char ch = (char) num;
        if (ch >= 'a' && ch <= 'z') {
            return ch;
        } else if (ch >= 'A' && ch <='Z') {
            return ch;
        } else if (ch >= '0' && ch <= '9') {
            return ch;
        } else {
            return (' ');
        }
    }
}
