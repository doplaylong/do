package com.itheima.demo18;

public class Mouse implements Usb {
    @Override
    public void openUsb() {
        System.out.println("鼠标开启");
    }

    @Override
    public void closeUsb() {
        System.out.println("鼠标关闭");
    }
    public void click() {
        System.out.println("鼠标点击");
    }
}
