package com.itheima.demo09;
/*获取数组最大值思路:
       1.定义变量用于记录比较后的较大值
       2.变量的默认值是数组0索引的元素
       3.遍历取出每一个元素
       4.拿取出的数据和较大值比较
       5.如果取出的数据大于较大值,较大值换成取出的数据
       6.遍历完毕,最大值就出来了*/
public class demo09_3 {
    public static void main(String[] args) {
        double[] arr = new double[] {1.0, 1.2, 2.1, 3.5, 4.6, 5.7, 2.2};
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值为 :" + max);
    }
}
