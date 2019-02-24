package com.itheima.demo12;

public class Role {
    private String id;
    private String name;
    private Weapon we;
    public void attack() {
        System.out.println(name + "使用" + we.getName() + ",造成了" + we.getHurt() + "点伤害");
    }
    public Weapon getWe() {
        return we;
    }

    public Role() {
    }

    public Role(String id, String name, Weapon we) {
        this.id = id;
        this.name = name;
        this.we = we;
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

    public void setWe(Weapon we) {
        this.we = we;
    }
}
