package com.itheima.test3;

public class Test3 {
    public static void main(String[] args) {
        Player p = new Player() {
            @Override
            public void playBasketball() {
                System.out.println("打篮球");
            }

            @Override
            public void playPingpong() {
                System.out.println("打乒乓球");
            }
        };
        p.playBasketball();
        p.playPingpong();
    }
}
