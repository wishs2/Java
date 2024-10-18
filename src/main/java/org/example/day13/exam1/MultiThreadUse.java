package org.example.day13.exam1;

public class MultiThreadUse {

    public static void main(String[] args) {

        TimeThread tt = new TimeThread();
        EvenThread ev = new EvenThread();

        tt.start();
        ev.start();
    }

}
