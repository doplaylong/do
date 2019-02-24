package com.itheima.demo11;
    /*
        定义一个方法,按指定格式打印ArrayList集合中的内容: {元素@元素@元素}
            返回值类型: void
            参数列表: 打印哪个集合中的内容不确定,ArrayList集合作为参数
      */
import java.util.ArrayList;

public class Demo113 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("春天");
        list.add("夏天");
        list.add("秋天");
        list.add("冬天");
        printArrayList(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("貂蝉");
        list2.add("西施");
        list2.add("杨玉环");
        list2.add("王昭君");
        printArrayList(list2);


    }
    public static void printArrayList(ArrayList<String> l) {
        System.out.print("{");
        for (int i = 0; i < l.size(); i++) {
            String str = l.get(i);
            System.out.print(str);
            if (i == l.size() - 1) {
                System.out.println("}");
            } else {
                System.out.print("@");
            }
        }
    }
}
