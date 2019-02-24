package com.itheima;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

//        methodParam(new Scanner(System.in));
        Scanner a = methodreturn();
        int b = a.nextInt();
        System.out.println("输入的是: " + b);

    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是: " + num);
    }
    public static Scanner methodreturn() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }


}

