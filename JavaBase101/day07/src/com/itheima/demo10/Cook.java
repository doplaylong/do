package com.itheima.demo10;
// 1.定义类继承抽象类
public class Cook extends Employee {
    public Cook() {
    }
    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }
    public void work() {
        System.out.println(getName() + "厨师炒菜多加点盐");
    }
}
