package com.itheima.demo10;

public class Demo10_3 {
    public static void main(String[] args) {
        Manager m = new Manager("168", "张三",20000);
        m.work();
        Cook c = new Cook();
        c.work();
        Waiter w = new Waiter( "169", "李四",8000);
        w.work();
    }
}


abstract class Employee_3 {
    private String ID;
    private String name;
    private int salary;

    public Employee_3() {
    }

    public Employee_3(String ID, String name, int salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }
    public abstract void work();

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}


class Manager_3 extends Employee_3 {
    public Manager_3() {
    }
    public Manager_3(String ID, String name, int salary) {
        super(ID, name, salary);
    }
    public void work() {
        System.out.println(getName() + "经理管理人");
    }
}


class Waiter_3 extends Employee_3 {
    public Waiter_3() {
    }
    public Waiter_3(String id, String name, int salary) {
        super(id, name, salary);
    }
    public void work() {
        System.out.println(getName() + "服务员点菜");
    }
}


class Cook_3 extends Employee_3 {
    public Cook_3() {
    }
    public Cook_3(String ID, String name, int salary) {
        super(ID, name, salary);
    }

    public void work() {
        System.out.println(getName() + "厨师炒菜");
    }
}