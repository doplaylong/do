package com.itheima.demo12_2;

public class Demo12 {
    public static void main(String[] args) {
        Weapon we = new Weapon("绝世好剑", 999);
        Role role = new Role("古天乐","cq008",we);
        role.attack();
    }
}
