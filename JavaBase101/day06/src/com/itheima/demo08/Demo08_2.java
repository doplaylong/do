package com.itheima.demo08;

public class Demo08_2 {
    public static void main(String[] args) {
        Person2 p = new Person2();
        System.out.println("p = " + p);
        p.setName("苍老师");
        p.setAge(-18);
        System.out.println(p.getAge());
        System.out.println(p.getName());
    }
}
