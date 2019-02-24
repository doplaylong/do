package com.itheima.demo12;

public class Demo12 {
    public static void main(String[] args) {
        Weapon w = new Weapon("屠龙刀", 999);
        Role role = new Role("cq001", "渣渣辉",w);
        role.attack();
    }
}
