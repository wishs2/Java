package org.example.day12.extend.thread2;

public class Star2 extends Thread {
    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.println(" 민소원" + (i + 1));
        }
    }
}
