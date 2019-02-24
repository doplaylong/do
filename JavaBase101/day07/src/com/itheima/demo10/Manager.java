package com.itheima.demo10;
// 让经理继承员工类
// 1.定义类继承抽象类 alt + 回车 -> implement Methods
public class Manager extends Employee {
    public Manager() {
    }

    public Manager(String id, String name, double salary) {
        super(id, name, salary);
    }

    // 2.重写抽象方法
    public void work() {
        System.out.println(getName() + "经理管理其他人");
    }
}




