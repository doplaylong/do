package com.itheima.demo09;

public class Demo09 {
    public static void main(String[] args) {
        Person p = new Person();
        p.eat();
        p.setName("如花");
        p.setAge(18);
        p.eat();

        Person p2 = new Person("凤姐" , 21);
        p2.eat();
        p2.setName("张三");
        p2.setAge(25);
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        p2.eat();



    }





}
