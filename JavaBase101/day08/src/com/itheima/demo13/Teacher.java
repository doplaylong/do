package com.itheima.demo13;

public class Teacher extends Person implements Swimmable {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + "老师,裸泳...");
    }
    public void teach() {
        System.out.println(getName() + "老师,站着上课...");
    }
}
