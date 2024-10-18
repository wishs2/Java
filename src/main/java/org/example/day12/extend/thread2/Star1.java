package org.example.day12.extend.thread2;

public class Star1 extends Thread {
    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.println("* " + (i + 1));
        }
    }
}
