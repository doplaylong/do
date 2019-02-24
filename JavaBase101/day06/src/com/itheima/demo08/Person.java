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
public class Person {
//  1.将成员变量私有
    private String name;
    private  int age;

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("年龄非法");
            this.age = 3;
        }   else {
                this.age = age;
        }
    }
//    2.给成员变量提供方法
//    修改姓名的方法
    public void setName(String name) {
        System.out.println("this = " + this);
        this.name = name;
    }
//    获取姓名的方法
    public String getName() {
        return name;
    }
//    获取年龄的方法
    public int getAge() {
        return  age;
    }
    public void eat() {
        System.out.println(name + "," + age + "");
    }
}
