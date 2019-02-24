package com.itheima.test5;

public class Test6 {
    public static void main(String[] args) {
        Cock c = new Cock(2,"红色");
        c.eatWay();
        c.daMing();

        Duck d = new Duck(1, "黑色");
        d.eatWay();
        d.swim();
    }
}


abstract class Animal2 {
    private int age;
    private String color;

    public abstract void eatWay();

    public Animal2() {
    }

    public Animal2(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Cock extends Animal2 {

    public Cock() {
    }

    public Cock(int age, String color) {
        super(age, color);
    }

    public void eatWay() {
        System.out.println(getAge() + "岁的" + getColor() + "的公鸡在啄米");
    }
    public void daMing() {
        System.out.println(getAge() + "岁的" + getColor() + "的公鸡在打鸣");
    }
}

class Duck extends Animal2 {
    public Duck() {
    }

    public Duck(int age, String color) {
        super(age, color);
    }

    public void eatWay() {
        System.out.println(getAge() + "岁的" + getColor() + "的鸭子在吃饭");
    }
    public void swim() {
        System.out.println(getAge() + "岁的" + getColor() + "的鸭子在游泳");
    }
}
