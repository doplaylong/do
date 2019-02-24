package com.itheima.demo09;
/*获取数组最大值思路:
       1.定义变量用于记录比较后的较大值
       2.变量的默认值是数组0索引的元素
       3.遍历取出每一个元素
       4.拿取出的数据和较大值比较
       5.如果取出的数据大于较大值,较大值换成取出的数据
       6.遍历完毕,最大值就出来了*/
public class demo09 {
    public static void main(String[] args) {
       int[] arr = new int[] {5, 15, 2000, 10000, 100, 4000};
//                             0   1   2      3     4    5
//   1.定义变量用于记录比较后的较大值
//   2.变量的默认值是数组0索引的元素
        int max = arr[0];
//   3.遍历取出每一个元素
        for (int i = 1; i < arr.length; i++) {
//   4.拿取出的数据和较大值比较
            if (arr[i] > max) {
//   5.如果取出的数据大于较大值,较大值换成取出的数据
                max = arr[i];
            }
        }
//   6.遍历完毕,最大值就出来了
        System.out.println("最大值: " + max);
    }
}
