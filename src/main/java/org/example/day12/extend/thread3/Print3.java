package org.example.day12.extend.thread3;

public class Print3 extends Thread {
    String[] foods = {"a", "b", "c", "d", "e", "f"};
    public void run() {
        for (int i = 0; i < foods.length; i++) {
            System.out.println(foods[i]);
        }
    }
}
