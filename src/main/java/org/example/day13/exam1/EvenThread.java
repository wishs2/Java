package org.example.day13.exam1;

public class EvenThread extends Thread {

    public void run() {
        for (int i = 0; i < 500; i++) {
            if (i % 2 == 0) {
                System.out.println("카운터>> " + i);
            }
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("error");
        }
    }

}
