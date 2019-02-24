package com.itheima.test1;

public class Test1 {
    public static void main(String[] args) {
        Employee e =new Employee() {

            @Override
            public void work() {
                System.out.println(getName() + "在开会");
            }

            @Override
            public void meet() {
                System.out.println(getName() + "在工作");
            }
        };
        e.work();
        e.meet();
    }
}
