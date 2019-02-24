package com.itheima.test5;

public class Test8 {
    public static void main(String[] args) {
        Lecturer l = new Lecturer("666", "傅红雪");
        l.work();
        Tutor t = new Tutor("668", "顾棋");
        t.work();
        Maintainer m = new Maintainer("686", "庖丁");
        m.work();
        Buyer b = new Buyer("888", "景甜");
        b.work();
    }
}


abstract class Employee {
    private String ID;
    private String name;

    public abstract void work();

    public Employee() {
    }

    public Employee(String ID, String name) {
        this.ID = ID;
        this.name = name;
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
}

abstract class Teacher3 extends Employee {
    public Teacher3() {
    }

    public Teacher3(String ID, String name) {
        super(ID, name);
    }
}

 abstract class AdminStaff extends Employee {
    public AdminStaff() {
    }

    public AdminStaff(String ID, String name) {
        super(ID, name);
    }
}

class Lecturer extends Teacher3 {

    public Lecturer() {
    }

    public Lecturer(String ID, String name) {
        super(ID, name);
    }

    public void work() {
        System.out.println("工号为 " + getID() + "的讲师 " + getName() + " 在讲课");
    }
}

class Tutor extends Teacher3 {

    public Tutor() {
    }

    public Tutor(String ID, String name) {
        super(ID, name);
    }

    public void work() {
        System.out.println("工号为 " + getID() + "的助教 " + getName() + " 在帮助学生解决问题");

    }
}

class Maintainer extends AdminStaff {

    public Maintainer() {
    }

    public Maintainer(String ID, String name) {
        super(ID, name);
    }

    public void work() {
        System.out.println("工号为 " + getID() + "的维护人员 " + getName() + " 在解决不能共享屏幕问题");
    }
}

class Buyer extends AdminStaff {

    public Buyer() {
    }

    public Buyer(String ID, String name) {
        super(ID, name);
    }

    public void work() {
        System.out.println("工号为 " + getID() + "的采购专员 " + getName() + " 在采购音响设备");
    }
}
