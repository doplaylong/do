package com.itheima.demo13;

public class Person {
    private String name;
    private int age;
    public void eat() {
        System.out.println(name + "在吃饭");
    }

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
}
