package com.itheima.test06;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "在吃工作餐");
    }
    public void teach() {
        System.out.println(getName() + "在讲课");
    }
}
