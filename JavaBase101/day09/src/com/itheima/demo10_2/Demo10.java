package com.itheima.demo10_2;

public class Demo10 {
    public static void main(String[] args) {
        Student s = new Student();
        s.swimming();
        s.swimming();
        s.swimming();
        System.out.println("============");

        new Swimmable() {
            @Override
            public void swimming() {
                System.out.println("美女裸泳...");
            }
        }.swimming();

    }
}
