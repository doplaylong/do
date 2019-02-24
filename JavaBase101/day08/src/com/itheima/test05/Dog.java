package com.itheima.test05;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int weight) {
        super(name, weight);
    }

    public void lookHome() {
        System.out.println("老老实实看家");
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
