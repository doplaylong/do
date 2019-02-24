package com.itheima.demo13;

public class Demo13 {
    public static void main(String[] args) {
        Student s = new Student("珊珊",18);
        s.eat();
        s.study();
        s.smoking();

        Teacher t = new Teacher("苍", 28);
        t.eat();
        t.teach();
        t.swimming();

        Driver d = new Driver("藤原拓海",16);
        d.eat();
        d.driving();
        d.swimming();

        Worker w = new Worker("二狗",20);
        w.eat();
        w.moveZhuan();
        w.smoking();

    }
}
