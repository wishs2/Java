package org.example.day12.extend.thread3;

public class PrintUse {
    public static void main(String[] args) {
        Print1 print1 = new Print1();
        Print2 print2 = new Print2();
        Print3 print3 = new Print3();

        print1.start();
        print2.start();
        print3.start();
    }
}
