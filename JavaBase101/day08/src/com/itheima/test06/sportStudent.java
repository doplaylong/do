package com.itheima.test06;

public class sportStudent extends Student implements Sport {
    public sportStudent() {
    }

    public sportStudent(int age, String name) {
        super(age, name);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为" + getAge() + "岁 " + getName() + " 的学生在打篮球");

    }
}
