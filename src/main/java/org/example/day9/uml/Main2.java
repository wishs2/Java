package org.example.day9.uml;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();

        item1.menu = "햄버거";
        item1.price = 5.99;

        item2.menu = "감자튀김";
        item2.price = 2.99;

        item3.menu = "콜라";
        item3.price = 1.99;

        Item[] items = {item1, item2, item3};

        Scanner sc = new Scanner(System.in);

        System.out.println("메뉴 번호를 입력, 3개 모두 주문 완료되었으면 'x' 입력 >> ");

        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + "-> " + items[i].getMenu() + ": " + items[i].getPrice() + "$");
        }
        String n = sc.nextLine();
        String[] s = n.split(" ");
        System.out.println("주문 내용---------\n");


    }
}
