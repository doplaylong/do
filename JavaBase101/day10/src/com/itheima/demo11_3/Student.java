package com.itheima.demo11_3;

public class Student {
    private String name;
    private int age;

    public void study() {
        System.out.println(name + "在努力的学习");
    }

    public Student() {
    }

    public Student(String name, int age) {
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
