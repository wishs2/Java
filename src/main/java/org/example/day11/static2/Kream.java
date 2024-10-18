package org.example.day11.static2;

public class Kream {
    int num;
    String brand;
    int price;
    static int sum;


    public Kream(int num, String brand, int price, int sales) {
        this.num = num;
        this.brand = brand;
        this.price = price;
        sum += sales;
    }

    public static int getSales() {
        return sum;
    }

    public String toString() {
        return "Kream 랭킹 "+ "[ " + num + "위" + ", 브랜드: " + brand + ", 가격: " + price + "원 ]";
    }


}
