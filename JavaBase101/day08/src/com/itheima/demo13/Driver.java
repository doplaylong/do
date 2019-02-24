package com.itheima.demo13;

public class Driver extends Person implements Swimmable {
    public Driver() {
    }

    public Driver(String name, int age) {
        super(name, age);
    }
    @Override
    public void swimming() {
        System.out.println(getName() + "司机,一边开车一边游泳");
    }
    public void driving() {
        System.out.println(getName() + "司机,单手五连发夹弯");
    }
}
