package org.example.day13.exam3;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(80, "red",20);
        Tablet tablet = new Tablet(70,"blue",70);
        Laptop laptop = new Laptop(100, "silver", 100);

        System.out.println(smartphone);
        System.out.println(tablet);
        System.out.println(laptop);

    }
}
