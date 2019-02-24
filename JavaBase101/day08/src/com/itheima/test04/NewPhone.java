package com.itheima.test04;

public class NewPhone extends OldPhone implements Play {
    @Override
    public void playGame() {
        System.out.println("新手机玩游戏");
    }
    public void call() {
        System.out.println("新手机打电话");
    }
    public void sendMessage() {
        System.out.println("新手机发短信");
    }
}
