package org.example.day4.day4_review;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        String[] name = {"아이유", "유재석", "BTS", "종료"};
        int[] vote = new int[3];

        Scanner sc = new Scanner(System.in);

        while (true) {//while은 t/s
            System.out.println("인기투표 1)아이유, 2)유재석, 3)BTS, 4)종료");
            System.out.print("선택번호>> ");
            int choice = sc.nextInt();
            //종료시점 반드시 명시

            System.out.println("----------------------");

            if (choice == 4) {
                System.out.println("아이유 : " + vote[0]);
                System.out.println("유재석 : " + vote[1]);
                System.out.println("BTS : " + vote[2]);
                System.out.println("총 투표수 : " + (vote[0] + vote[1] + vote[2]));
                break;
            }

            switch (choice) {
                case 1: vote[0]++;
                    System.out.println("아이유 선택");
                break;
                case 2: vote[1]++;
                    System.out.println("유재석 선택");
                break;
                case 3: vote[2]++;
                    System.out.println("BTS 선택");
                break;
                default:
                    System.out.println("잘 못 선택 하셨습니다.");
                    break;
            }

        } sc.close();

        System.out.println("-------------------");

        System.out.println("투표 종료");

        for (int i = 0; i < vote.length; i++) {
            System.out.println(name + ": " + vote[i] + "표");
        }
        System.exit(0);
    }
}
