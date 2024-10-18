package org.example.day12.extend.thread3;

import java.util.Date;

public class Print2 extends Thread {
    public void run() {
        for (int i = 0; i < 3000; i++) {
            Date d = new Date();
            System.out.println(d);
        }
    }
}
