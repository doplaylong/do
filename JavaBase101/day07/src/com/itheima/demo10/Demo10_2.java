package com.itheima.demo10;

public class Demo10_2 {
    public static void main(String[] args) {
        Manager m = new Manager("007","谭俊",15000);
        m.work();
        Waiter w = new Waiter("008","张三",3500);
        w.work();
        Cook c = new Cook("009","李四",8000);
        c.work();
    }
}

 abstract class Employee_2 {
    private String ID;
    private String name;
    private double salary;

    public Employee_2() {
    }

    public Employee_2(String ID, String name, double salary) {
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

     public double getSalary() {
         return salary;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }
 }

 class Manager_2 extends Employee_2 {
     public Manager_2() {
     }

     public Manager_2(String ID, String name, double salary) {
         super(ID, name, salary);
     }

     public void work() {
         System.out.println(getName() + "经理管理其他人");
     }
 }

 class Waiter_2 extends Employee_2 {
     public Waiter_2() {
     }
     public Waiter_2(String ID, String name, double salary) {
         super(ID, name, salary);
     }
     public void work() {
         System.out.println(getName() +"服务员点菜");
     }
 }

 class Cook_2 extends Employee_2 {
     public Cook_2() {
     }
     public Cook_2(String ID, String name, double salary) {
         super(ID, name, salary);
     }
     public void work() {
         System.out.println(getName() + ",厨师炒菜加多点盐");
     }
 }