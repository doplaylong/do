package com.itheima.demo18;

public class Keyboard implements Usb{

    @Override
    public void openUsb() {
        System.out.println("键盘开启");
    }

    @Override
    public void closeUsb() {
        System.out.println("键盘关闭");
    }
    public void type() {
        System.out.println("键盘敲击");
    }
}
