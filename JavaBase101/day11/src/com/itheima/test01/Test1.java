package com.itheima.test01;

public class Test1 {
    public static void main(String[] args) {
        char[] chatArray = {'你', '好'};
        String str1 = new String(chatArray);
        System.out.println("方式一创建字符串: " + str1);

        char[] chatArray2 = {'h', 'e', 'l', 'l', 'o'};
        String str2 = new String(chatArray2);
        System.out.println("方式二创建字符串: " + str2);

        byte[] byteArray = {97, 98, 99, 100, 101};
        String str3 = new String(byteArray);
        System.out.println("方式三创建字符串: " + str3);



    }
}
