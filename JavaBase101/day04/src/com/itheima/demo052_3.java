package com.itheima;
/*定义方法: 计算1+2+3...+100的和
        定义方法的2个明确:
        1.返回值类型(结果的类型): 1+2+3...+100的和结果是5050整数,返回int类型
        2.参数列表(未知数据作为参数列表): 没有未知数据,不需要参数列表*/
public class demo052_3 {
    public static void main(String[] args) {
        System.out.println(getSum());
    }
    public static int getSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
