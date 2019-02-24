package com.itheima.demo08;
/*
    当局部变量和成员变量重名了,优先使用局部变量(就近原则)
    局部变量隐藏了成员变量(了解)

    this关键字的作用: 用于区分局部变量和成员变量
        this.变量名 代表的是成员变量

    谁调用这个方法,方法中的this就是谁

    我们的目标:知道this能干什么
        当成员变量和局部变量重名
        this.age    代表成员变量
        age 局部变量
 */
public class Person4 {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("年龄非法");
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }
    public void eat() {
        System.out.println(name + "," + age + "岁, 正在吃饭");
    }
}
