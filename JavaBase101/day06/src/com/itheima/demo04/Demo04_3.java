package com.itheima.demo04;
/*
    定义手机类并使用：
        属性:品牌,价格,颜色
        行为:打电话,发短信

    面向对象使用步骤:
        1.定义类
        2.创建对象
        3.使用对象
 */
public class Demo04_3 {
    public static void main(String[] args) {
      Phone3 p = new Phone3();
        System.out.println(p.brand + "," + p.color + ","+ p.price );
        p.price = 1999;
        p.color = "黑色";
        p.brand = "小米";
        System.out.println(p.brand + "," + p.color + ","+ p.price );
        p.call("雷军");
        p.sendMessage();
    }
}
