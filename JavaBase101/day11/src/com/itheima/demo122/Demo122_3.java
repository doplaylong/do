package com.itheima.demo122;

import java.util.Arrays;

public class Demo122_3 {
    public static void main(String[] args) {
        String str = "jalsdjflsdjHH456654567963YIHGFKIFWREWDGTGFGfdsjkhf";
        char[] chr = str.toCharArray();
        Arrays.sort(chr);
        for (int i = 0; i < chr.length; i++) {
            System.out.print(chr[i] + " ");
        }
        System.out.println();

        for (int i = chr.length - 1; i >= 0; i--) {
            System.out.print(chr[i] + " ");
        }
    }
}
