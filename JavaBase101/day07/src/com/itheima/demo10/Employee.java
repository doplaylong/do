package com.itheima.demo10;

public abstract class Employee {
    private String id;
    private String name;
    private double salary;
// 抽象类就是在标准类的基础上多个了一个抽象方法而已
    // 抽象方法要放在抽象类中
    // 抽象的工作方法
    public abstract void work();

    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
