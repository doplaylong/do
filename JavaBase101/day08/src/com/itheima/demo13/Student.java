package com.itheima.demo13;

public class Student extends Person implements Smokeable{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void smoking() {
        System.out.println(getName() + "学生,躲在厕所瑟瑟发抖的抽烟软中华");
    }
    public void study() {
        System.out.println(getName() + "学生,努力的学习");
    }
}
