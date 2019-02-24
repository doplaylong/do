package com.itheima.demo132;
/*
    请使用 Math 相关的API，计算在  -10.8 到 5.9 之间，绝对值大于 6 或者小于 2.1 的整数有多少个?
    分析:
        1.定义一个变量保存数量
        2.使用for循环,获取-10.8 到 5.9 之间的整数:-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5
        3.获取到数字的绝对值
        4.如果绝对值大于 6 或者小于 2.1, 数量+1
        5.打印结果
 */
public class Demo132 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = (int)Math.ceil(-10.8); i < Math.ceil(5.9); i++ ) {
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                count++;
            }
        }
        System.out.println("数量: " + count);
    }
}
