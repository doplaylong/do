package com.itheima.demo13;

public class Worker extends Person implements Smokeable {
    public Worker() {
    }

    public Worker(String name, int age) {
        super(name, age);
    }

    public void moveZhuan() {
        System.out.println(getName() + "工人,头顶300块砖");
    }

    @Override
    public void smoking() {
        System.out.println(getName() + "工人,抽的是寂寞");
    }
}
