package com.itheima.demo09;

public class Demo09_2 {
    public static void main(String[] args) {
        Person2 p = new Person2();
        p.eat();
        p.setAge(18);
        p.setName("如花");
        System.out.println(p.getAge());
        System.out.println(p.getName());
        p.eat();

        Person2 p2 = new Person2("冰冰", 0);
        p2.eat();
        p2.setAge(-18);
        p2.setName("张三");
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        p2.eat();

    }
}








