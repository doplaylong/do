package com.itheima;
// 求a,b,c这3个取值范围为1到1000的数,同时满足a+b+c=1000,a平方加b平方等于c平方
public class Test2 {
    public static void main(String[] args) {
        for (int a = 0; a < 1000; a++) {

            for (int b = 0; b < 1000; b++) {

                for (int c = 0; c < 1000; c++) {
                    if (a + b + c == 1000 && a * a + b * b == c * c) {
                        System.out.println(a + "," + b + "," + c );
                    }
                }

            }
        }
    }
}
