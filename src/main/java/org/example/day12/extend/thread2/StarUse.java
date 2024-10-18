package org.example.day12.extend.thread2;

public class StarUse {
    public static void main(String[] args) {
        Star1 star1 = new Star1();
        Star2 star2 = new Star2();

        star1.start();
        star2.start();
    }
}
