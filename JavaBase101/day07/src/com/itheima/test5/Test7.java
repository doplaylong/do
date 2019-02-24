package com.itheima.test5;

public class Test7 {
    public static void main(String[] args) {
        Manager2 m = new Manager2("m110", "老王", 1000);
        m.eat();
        m.work();

        Cook c = new Cook("c110", "小王", 6000);
        c.eat();
        c.work();
    }
}

 abstract class Person3 {
    private String ID;
    private String name;
    private int salary;

    public abstract void work();
    public abstract void eat();
    public Person3() {
    }

    public Person3(String ID, String name, int salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

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

class Manager2 extends Person3 {
    public Manager2() {
    }

    public Manager2(String ID, String name, int salary) {
        super(ID, name, salary);
    }

    public void work() {
        System.out.println("工号为: " + getID() + ",姓名为" + getName() + "工资为: " + getSalary() + "的经理在工作,管理其他人");
    }
    public void eat() {
        System.out.println("工号为: " + getID() + ",姓名为" + getName() + "工资为: " + getSalary() + "的经理在吃鱼");
    }
}

    class Cook extends Person3 {
    public Cook() {
    }

    public Cook(String ID, String name, int salary) {
        super(ID, name, salary);
    }

    public void work() {
        System.out.println("工号为: " + getID() + ",姓名为" + getName() + "工资为: " + getSalary() + "的厨师在工作,炒菜");
    }
    public void eat() {
        System.out.println("工号为: " + getID() + ",姓名为" + getName() + "工资为: " + getSalary() + "的厨师在吃肉");
    }
}

