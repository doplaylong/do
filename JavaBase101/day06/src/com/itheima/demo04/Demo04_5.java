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
public class Demo04_5 {
    public static void main(String[] args) {
        Phone5 p = new Phone5();
        System.out.println("brand : " + p.brand + "," + "price : " + p.price + "," + "color :" + p.color );
        p.brand = "小米";
        p.price = 1999.0;
        p.color = "陶瓷黑";
        System.out.println("brand : " + p.brand + "," + "price : " + p.price + "," + "color :" + p.color );
        p.call("雷军");
        p.sendMessage();
    }
}

