package org.example.day12.extend.ex3;

public class Fancy {
    int price;
    String company;

    public Fancy(int price, String company) {
        this.price = price;
        this.company = company;
    }

    public void buy() {
        System.out.println("구매하다.");
    }
}
