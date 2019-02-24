package com.itheima;

import java.util.Arrays;

//使用Arrays相关的API,将一个随机字符串中的所有字符升序排列,并倒序打印.
public class Test10 {
    public static void main(String[] args) {
        String str = "lsjfsoigskljf469413646FJSLKFJSDKLFJ";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
