package com.itheima.test04;

public class Test04 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        char[] chr = str.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            System.out.println(chr[i]);
        }
        System.out.println("将str字符串转换为小写: " + str.toLowerCase());
        System.out.println("将str字符串转换为大写: " + str.toUpperCase());
        System.out.println("将str字符串中的字符'o'替换成'6': " + str.replace("o", "6"));
        System.out.println("将str字符串中的字符串ll替换成LL: " + str.replace("ll", "LL"));

    }
}
