package org.example.day12.extend.thread1;

public class Thread2 extends Thread {

    public void run() {
        for (int i = 100; i > 0; i--) {
            System.out.println("감소>>" + (i));
        }
    }
}
