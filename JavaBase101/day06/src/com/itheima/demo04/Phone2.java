package com.itheima.demo04;
/*
定义手机类并使用：
    属性:品牌,价格,颜色
    行为:打电话,发短信
 */
public class Phone2 {
     String brand;
     int price;
     String color;

     public void call(String name) {
         System.out.println("给"+ name + "打电话");
     }
     public void sendMessage() {
         System.out.println("群发短信");
     }
}
