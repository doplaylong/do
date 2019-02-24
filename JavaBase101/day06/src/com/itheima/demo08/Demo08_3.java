package com.itheima.demo08;

public class Demo08_3 {
    public static void main(String[] args) {
        Person3 p = new Person3();
        p.eat();
        p.setName("古力娜扎炸");
        p.setAge(21);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        p.eat();
    }

}

