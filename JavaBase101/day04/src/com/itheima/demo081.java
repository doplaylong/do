package com.itheima;
/*比较两个数据是否相等。参数类型分别为两个 byte 类型，两个 short 类型，两个 int 类型，两个 long 类型，并
        在 main 方法中进行测试。

        内容.sout -> 打印*/
public class demo081 {
    public static void main(String[] args) {
        byte x = 1;
        byte y = 2;
        System.out.println(compare(x, y));

        long m = 10L;
        long n = 10L;
        System.out.println(compare(m,n));
    }
//    比较两个 byte 是否相等
    public static boolean compare(byte b1,byte b2) {
        System.out.println("compare byte");
        return b1 == b2;
    }
//        比较两个 short 是否相等
    public static boolean compare(short b1, short b2) {
        System.out.println("compare short");
        return b1 == b2;
    }
//    比较两个 int 是否相等
    public static boolean compare(int b1, int b2) {
        System.out.println("compare int");
        return b1 == b2;
    }
//    比较两个 long 是否相等
    public static boolean compare(long b1, long b2) {
        System.out.println("compare long");
        return b1 == b2;
    }
}
