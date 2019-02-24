package com.itheima.test08;

public class Test08 {
    public static void main(String[] args) {
        String str = "javajfiewjavajfiowfjavagkljjava";
        int num =getCount(str, "java");
        System.out.println("javajfiewjavajfiowfjavagkljjava字符串中java的数量: " + num);


    }
    public static int getCount(String str,String ch) {
        int count = 0;
        while (str.indexOf(ch) != -1) {
            int index = str.indexOf(ch);
            str = str.substring(index + ch.length());
            count++;
        }
        return count;
    }
}
