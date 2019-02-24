package com.itheima.demo10;

public class Waiter extends Employee {
    public void work() {
        System.out.println("服务员点菜");
    }

    public Waiter() {
    }

    public Waiter(String id, String name, double salary) {
        super(id, name, salary);
    }
}
