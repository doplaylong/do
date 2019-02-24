package com.itheima.demo13;
/*
    有一个编程比赛,有5个评委给选手打分.取消最高分和最低分后的平均分
    就是这个选手的最后得分,这5个评委的评分为:{99, 100, 98, 97, 96};

    分析:
        1.5个评委评分使用数组保存
        2.找到数组中最高分(找最大值)
        3.找到数组中最低分(找最小值)
        4.将5个评委的评分求和
        5.有效得分 = 总分 - 最高分 - 最低分
        6.最后得分 = 有效总分 / 人数
 */
public class demo13_3 {
    public static void main(String[] args) {
        int[] arr = new int[] {99, 100, 98, 97, 96};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值: " + max);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("最小值: " + min);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int score = sum - max - min;
        int s = score / (arr.length-2);
        System.out.println("最后得分: " + s);
    }
}
