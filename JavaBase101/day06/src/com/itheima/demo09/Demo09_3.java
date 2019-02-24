package com.itheima.demo09;

public class Demo09_3 {
    public static void main(String[] args) {
        Person3 p = new Person3();
        p.eat();
        p.setAge(21);
        p.setName("如花");
        System.out.println(p.getAge());
        System.out.println(p.getName());
        p.eat();

        Person3 p2 = new Person3("如花", 25);
        p2.eat();
        p2.setAge(-18);
        System.out.println(p2.getAge());
        p2.setName("太阳");
        System.out.println(p2.getName());
        p2.eat();


    }
}


