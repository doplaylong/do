package com.itheima.test8;

import java.util.ArrayList;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请录入第" + i + "本书的名称: ");
            String a = sc.next();
            System.out.println("请录入第" + i + "本书的ISBN编码: ");
            String b = sc.next();
            System.out.println("请录入第" + i + "本书的价格: ");
            double c = sc.nextDouble();
            list.add(new Book(a, b, c)) ;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getTitle() + "," + list.get(i).getIsbn() + "," + list.get(i).getPrice());
        }
    }
}
