package com.itheima.demo11;

import java.util.ArrayList;

/*
    自定义4个学生对象,添加到ArrayList集合,并遍历(重要)

    分析:
        1.定义学生类
        2.创建ArrayList集合
        3.创建4个学生对象
        4.将这4个学生对象添加到集合中
        5.遍历集合取出学生
 */
public class Demo112 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("小一", 16);
        Student s2 = new Student("小二", 17);
        Student s3 = new Student("小三", 18);
        Student s4 = new Student("小四", 19);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + ",," + s.getAge());
        }
        // 扩展: 遍历ArrayList中的每个学生,当学生年龄小于23岁,就调用学生学习方法
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getAge() < 19) {
                s.study();
            }
        }
        // 扩展,计算ArrayList所有学生的总年龄
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            sum += s.getAge();
        }
        System.out.println("总年龄: " + sum);

    }
}
