package com.itheima.test5;

public class Test3 {
    public static void main(String[] args) {
        Dog d = new Dog("旺财", "棕色",500);
        d.eat();
        d.lookHome();
        System.out.println("-----------------");
        Cat c = new Cat("波斯猫", "黄色",600);
        c.eat();
        c.catchMouse();
    }
}

class Animal {
    private String name;
    private String color;
    private double price;

    public Animal() {
    }

    public Animal(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void eat() {
        System.out.println(name + "在吃饭");
    }
}

class Dog extends Animal {
    public Dog() {
    }
    public Dog(String name, String color, double price) {
        super(name, color, price);
    }
    public void lookHome() {
        System.out.println(getName() + "狗看家");
    }
}

class Cat extends Animal {
    public Cat() {
    }
    public Cat(String name, String color, double price) {
        super(name, color, price);
    }
    public void catchMouse() {
        System.out.println(getName() + "猫抓老鼠");
    }
}
