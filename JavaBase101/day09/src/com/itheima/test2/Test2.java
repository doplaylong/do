package com.itheima.test2;

public class Test2 {
    public static void main(String[] args) {
        Phone p =new Phone() {
            @Override
            public void call() {
                System.out.println("打电话");
            }

            @Override
            public void sendaMessage() {
                System.out.println("发短信");
            }
        };
        p.call();
        p.sendaMessage();
    }
}
