package com.itheima.test5;

public class Test8 {
    public static void main(String[] args) {
        String[] c = {"D", "C", "B", "A", "D"};
        System.out.println("满分10分,小传:得分: "+ getScore(c));
        String[] z = {"A", "D", "B", "C", "D"};
        System.out.println("满分10分,小智:得分: "+ getScore(z));
        String[] b = {"A", "D", "B", "C", "A"};
        System.out.println("满分10分,小播:得分: "+ getScore(b));
        String[] k = {"A", "B", "C", "D", "D"};
        System.out.println("满分10分,小课:得分: "+ getScore(k));
    }
    public static int getScore(String[] s) {
        String[] arr = {"A", "D", "B", "C", "D"};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s[i]) {
                count++;
            }
        }
        return count * 2;
    }
}
