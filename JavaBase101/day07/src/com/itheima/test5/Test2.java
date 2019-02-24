package com.itheima.test5;

public class Test2 {
    public static void main(String[] args) {
        Coder c = new Coder();
        c.setName("马化腾");
        c.eat();
        c.sleep();
        c.coding();
        System.out.println("------------------");
        Teacher t = new Teacher();
        t.setName("马云");
        t.eat();
        t.sleep();
        t.teach();
    }
}




class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat() {
        System.out.println(name + "吃饭");
    }
    public void sleep() {
        System.out.println(name + "睡觉");
    }
}


class Coder extends Person {
    public Coder() {
    }

    public Coder(String name, int age) {
        super(name, age);
    }
    public void coding() {
        System.out.println(getName() + "敲代码");
    }
}

class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }
    public void teach() {
        System.out.println(getName() + "上课");
    }
}
