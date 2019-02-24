package com.itheima;

public class Test8 {
    public static void main(String[] args) {
        double she = 30.0;
        System.out.println("摄氏度为:"+ she + "°--华氏度为:" + wenDuZhuanHuan1(30.0)+"°");

        double hua = 86.0;
        System.out.println("华氏度为:"+ hua + "--°摄氏度为:" + wenDuZhuanHuan2(86.0)+"°");
    }
    public static double wenDuZhuanHuan1(double she) {
        double hua = (9.0 / 5) * she + 32;
        return hua;
    }
    public static double wenDuZhuanHuan2(double hua) {
        double she = (hua - 32)/( 9.0 / 5);
        return she;
    }
}
