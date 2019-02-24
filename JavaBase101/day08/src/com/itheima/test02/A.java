package com.itheima.test02;

public interface A {
    public abstract void showA();
    public default void showB() {
        System.out.println("BBBB");
    }
}
