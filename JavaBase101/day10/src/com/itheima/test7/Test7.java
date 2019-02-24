package com.itheima.test7;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<Worker> list = new ArrayList<>();
        Worker w1 = new Worker("bz001", "黄渤", 45);
        Worker w2 = new Worker("bz002", "孙红雷", 48);
        Worker w3 = new Worker("bz003", "罗志祥", 35);
        list.add(w1);
        list.add(w2);
        list.add(w3);
        findMaxAge(list);

    }
    public static void findMaxAge(ArrayList<Worker> l) {
        Worker maxAgeWorker = l.get(0);
        for (int i = 1; i < l.size(); i++) {
            if (maxAgeWorker.getAge() < l.get(i).getAge()) {
                maxAgeWorker = l.get(i);
            }
        }
        System.out.println("最高年龄worker对象: ");
        maxAgeWorker.show();

    }
}
