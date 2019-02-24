package com.itheima.demo122;

import java.util.Arrays;

/*
    请使用 Arrays 相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
    "ysKUreaytWTRHsgFdSAoidq"

    分析:
        1.去Arrays类中查看有没有将字符串直接排序的?
        2.在Arrays类中发现有各种数组排序的方法,唯独没有字符串排序
        3.我们可以将字符串先转成char[].
        4.在调用Arrays类中sort​(char[] a),给char[]排序即可
        5.并倒序打印
 */
public class Demo122 {
    public static void main(String[] args) {
        String str = "jsljDJOHLSfjdoj65464646dfsffdfSHID";
        char[] chs = str.toCharArray();
        Arrays.sort(chs);
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + " ");
        }
        System.out.println();

        for (int i = chs.length - 1; i >= 0; i--) {
            System.out.println(chs[i] + " ");
        }
    }
}
