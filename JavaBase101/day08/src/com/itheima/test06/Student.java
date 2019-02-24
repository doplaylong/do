package com.itheima.test06;

public class Student extends Person {
    public Student() {
    }

    public Student(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "在吃学生餐");
    }
    public void study() {
        System.out.println(getName() + "在学习");
    }
}
