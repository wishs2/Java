package org.example.day9.uml;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {

        Item[] name = new Item[3];

        String[] menu = {"Buger", "Fries", "Soda"};
        Double[] price = {5.99, 2.99, 1.99};

        Scanner sc = new Scanner(System.in);

        System.out.println("메뉴 번호를 입력, 3개 모두 주문 완료되었으면 'x' 입력 >> ");
        System.out.println("주문 가능한 메뉴 입니다.\n");
        System.out.println("=================");

        for (int i = 0; i < name.length; i++) {
            System.out.println((i + 1) + ">> " + menu[i] + ": $" + price[i]);
        }

        double total = 0.0;

        while (true) {
            String input = sc.nextLine();
            if (input.equals("x")) {
                break; // 'x'를 입력하면 루프 종료
            }

            try {
                int itemIndex = Integer.parseInt(input) - 1; // 메뉴 번호를 정수로 변환
                if (itemIndex >= 0 && itemIndex < menu.length) {
                    total += price[itemIndex]; // 선택한 메뉴의 가격을 총 가격에 추가
                    System.out.println(menu[itemIndex] + "가 주문되었습니다.");
                } else {
                    System.out.println("유효하지 않은 메뉴 번호입니다. 다시 시도하세요.");
                }
            } catch (NumberFormatException e) {
                System.out.println("유효하지 않은 입력입니다. 숫자 또는 'x'를 입력하세요.");
            }
        }

        System.out.printf("주문이 완료되었습니다. 총 금액: $%.2f%n", total);
        sc.close();

    }
}
