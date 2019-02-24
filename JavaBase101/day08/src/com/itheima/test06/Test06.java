package com.itheima.test06;

public class Test06 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(45, "马云");
        sportTeacher t2 = new sportTeacher(35, "大姚");
        Student s1 = new Student(20, "小王");
        sportStudent s2 = new sportStudent(21,"王中王");

        t2.playBasketball();
        s2.playBasketball();

    }
}
