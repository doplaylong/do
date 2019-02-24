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
public class Demo04_2 {
    public static void main(String[] args) {
        Phone2 p = new Phone2();
        System.out.println(p.brand + "," + p.price +"," +p.color);
        p.brand = "锤子";
        p.price = 2999;
        p.color = "棕色";
        System.out.println(p.brand + "," + p.price +"," +p.color);

        p.call("罗永浩");
        p.sendMessage();
    }
}
