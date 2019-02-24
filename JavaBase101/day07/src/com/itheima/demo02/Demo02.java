package com.itheima.demo02;
/*
请使用继承定义以下类:
    1. 程序员(Coder)
        成员变量: 姓名,年龄
        成员方法: 吃饭,睡觉,敲代码

    2. 老师(Teacher)
        成员变量: 姓名,年龄
        成员方法: 吃饭,睡觉,上课
 */
public class Demo02 {
    public static void main(String[] args) {
        Coder c = new Coder();
        c.name = "马化腾";
        c.age = 45;
        c.eat();
        c.sleep();
        c.coding();

        Teacher t = new Teacher();
        t.name = "马云";
        t.age = 54;
        t.eat();
        t.sleep();
        t.teach();
    }
}
