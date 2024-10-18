package org.example.day13.exam1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeThread extends Thread {

    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        for (int i = 0; i < 300 + 1; i++) {
            System.out.println("시각>> " + sdf.format(new Date()));
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("error");
        }
    }

}
