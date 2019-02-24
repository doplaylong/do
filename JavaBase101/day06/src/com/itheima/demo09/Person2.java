package com.itheima.demo09;
/*
    人类:
        属性:姓名,年龄
        行为:吃饭
 */
public class Person2 {
    private String name;
    private int age;

    public Person2() {

    }
    public Person2(String name, int age) {
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
        if(age < 0 || age > 150) {
            System.out.println("年龄无效");
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
