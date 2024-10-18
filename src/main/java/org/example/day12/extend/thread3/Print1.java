package org.example.day12.extend.thread3;

public class Print1 extends Thread{
    public void run() {
        for (int i = 500; i > 0; i--) {
            System.out.println(i);
        }
    }
}
