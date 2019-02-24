package com.itheima.test5;

public class Test5 {
    public static void main(String[] args) {
        Teacher2 t = new Teacher2("王小平",30,"Java");
        t.teach();

        Student s = new Student("李小乐", 12, 90);
        s.test();
    }
}

class Person2 {
    private String name;
    private int age;

    public Person2() {
    }
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

class Teacher2 extends Person2 {
    private String subject;

    public Teacher2() {
    }
    public Teacher2(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void teach() {
        System.out.println(getName() + "老师,讲授" + subject + "课");
    }
}

class Student extends Person2 {
    private int score;
    public Student() {
    }
    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public void test() {
        System.out.println(getName() + "同学,考试得了: " + score + "分");
    }
}