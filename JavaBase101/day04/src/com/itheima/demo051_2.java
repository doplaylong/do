package com.itheima;
/*定义方法: 比较两个整数是否相同
        定义方法的2个明确:
        1.返回值类型(结果的类型): 两个整数是否相同,
        要么相同(true),(false),boolean类型
        2.参数列表(未知数据作为参数列表): 比较哪
        两个整数不确定.作为参数列表*/

public class demo051_2 {
    public static void main(String[] args) {
        System.out.println(compare(5,6));
    }
    public static boolean compare(int a ,int b) {
        boolean x = a == b;
        return x;
    }
}



