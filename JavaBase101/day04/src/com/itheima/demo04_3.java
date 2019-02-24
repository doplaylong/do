package com.itheima;

public class demo04_3 {
    public static void main(String[] args) {
//        1.直接调用:方法名();    没有处理返回值
        add(2,6);
//        2.赋值调用(常用): 数据类型 变量名 = 方法名();    有处理返回值
        int sum = add(5,9);
        sum++;
        System.out.println(sum);
//        3.输出调用: System.out.println(方法名());   可以打印返回值
        System.out.println(add(8,5));
    }
    public static int add(int x ,int y) {
        return x + y;
    }
}
