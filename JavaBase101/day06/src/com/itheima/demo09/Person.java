package com.itheima.demo09;
/*
    人类:
        属性:姓名,年龄
        行为:吃饭
 */
public class Person {
//    属性:姓名,年龄
    private String name;
    private int age;

//    构造方法
    public Person() {
        System.out.println("我是构造方法");
    }
    public Person(String name, int age) {
//        构造方法给成员变量赋值
        this.name = name;
        this.age = age;
    }
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
        System.out.println(name + "," + age + ",在吃饭");
    }
}
