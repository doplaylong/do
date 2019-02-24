package com.itheima.demo12_2;

public class Role {
    private String name;
    private String id;
    private Weapon we;

    public Role() {
    }

    public Role(String name, String id, Weapon we) {
        this.name = name;
        this.id = id;
        this.we = we;
    }
    public Weapon getWe2() {
        return we;
    }
    public void attack() {
        System.out.println(name + "使用" + we.getName() + ",造成了" + we.getHurt() + "点伤害");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Weapon getWe() {
        return we;
    }

    public void setWe(Weapon we) {
        this.we = we;
    }

}
