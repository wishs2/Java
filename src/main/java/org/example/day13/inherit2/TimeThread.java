package org.example.day13.inherit2;

import java.util.Date;

public class TimeThread extends Thread {

    public void run() {
        for (int i = 0; i < 3000; i++) {
            System.out.println("time>> " + new Date());

            try {
                Thread.sleep(500); //(1초 : 1000, 0.5초(500)
            } catch (InterruptedException e) {
                System.out.println("error");
            }
        }
    }
}
