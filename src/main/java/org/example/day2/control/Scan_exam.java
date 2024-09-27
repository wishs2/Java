package org.example.day2.control;

import java.util.Scanner;

public class Scan_exam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("여행 지역을 입력하세요.: ");
        String name = sc.nextLine();

        System.out.println("1인당 경비를 입력하세요.: ");
        int money = sc.nextInt();

        System.out.println("여행인원을 입력하세요.: ");
        int people = sc.nextInt();

        System.out.println("할인율(%)을 입력하세요.: ");
        float sale = sc.nextFloat();

        System.out.println("VIP 여부를 입력하세요.: ");
        boolean vip1 = sc.nextBoolean();

        sc.nextLine();
        System.out.println("당부의 말을 입력하세요: ");
        String word = sc.nextLine();

        float finalRate = 0;

        System.out.println("여행 지역: " + name);
        System.out.println("1인당 경비: " + money + "원");
        System.out.println("여행 인원: " + people + "인");
        System.out.println("기본 할인율: " + sale + "%");
        if (vip1) {

            /*
            If가 조건문이니까 IF 안에 있는 블럭에서 변수를 선언해도 블럭 밖에서는 사용 불가
            따라서 밖에서 선언을 해주고 컴퓨터한테 니가 알아서 찾아 넣어라. 하는 느낌
            -finalRate
             */

            finalRate = sale + 5;
            System.out.println("VIP추가 할인율: 5%");

        } else {
            finalRate = sale;
            System.out.println("VIP추가 할인율: 0%");
        }

        float final_B = money * people;
        float final_BB = final_B * finalRate / 100;
        System.out.println("최종 할인율: " + finalRate + "%");
        System.out.println("총 경비: " + final_B);
        System.out.println("할인 금액: " + final_BB);
        System.out.println("할인 후 총 경비: " + (final_B - final_BB));
        System.out.println("당부의 말: " + word);



        /*

        코드는 위에서부터 차례대로 실행됨
        블럭 안에서 선언된 것들은 블럭 밖에서 실행될 수 없기 때문에
        사용하고자 하는 블럭(영역) 안에서 선언해야함(a.k.a. 변수의 생명주기)

         */


    }
}
