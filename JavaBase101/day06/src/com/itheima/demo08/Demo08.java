package com.itheima.demo08;

public class Demo08 {
    public static void main(String[] args) {
        // 创建对象
        Person p = new Person();
        System.out.println("p = " + p);
        // p的地址和setName方法中的this地址是一样.是同一个对象
        // 谁调用这个方法,方法中的this就是谁
        p.setName("苍老师");
        p.setAge(-18);
        System.out.println(p.getAge()); // 获取成员变量
        System.out.println(p.getName());
    }
}
