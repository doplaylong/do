package com.itheima.test06;

public class sportTeacher extends Teacher implements Sport {

    public sportTeacher() {
    }

    public sportTeacher(int age, String name) {
        super(age, name);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为" + getAge() + "岁 " + getName() + " 的老师在打篮球");
    }
}
