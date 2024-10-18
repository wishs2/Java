package org.example.day11.static2;

import java.util.Arrays;
import java.util.Scanner;

import static java.awt.SystemColor.info;

public class ExamUse {
    public static void main(String[] args) {
        Exam[] accounts = new Exam[3];

        int count = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("은행계좌 관리 애플리케이션");
            System.out.println("1. 계좌 생성");
            System.out.println("2. 계좌 목록 보기");
            System.out.println("3. 계좌 정보 검색");
            System.out.println("4. 계좌 삭제");
            System.out.println("5. 프로그램 종료");
            System.out.println("메뉴를 선택하세요 : ");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("새 계좌 정보를 입력하세요. (형식: 계좌번호 소유자 잔액\n");
                    Scanner sc1 = new Scanner(System.in);
                    String[] input = sc1.nextLine().split(" ");

                    int account = Integer.parseInt(input[0]);
                    String name = input[1];
                    int money = Integer.parseInt(input[2]);

                    if (count < 3) {
                        accounts[count] = new Exam(account, name, money);
                        count++;
                        System.out.println("계좌가 생성되었습니다.\n");
                    } else {
                        System.out.println("계좌 생성이 불가능합니다.\n");
                    }
                    break;

                case 2:
                    System.out.println("저장된 모든 계좌 정보를 출력합니다.");
                    for (int i = 0; i < count; i++) {
                        System.out.println(accounts[i] + "\n");
                    }
                    break;

                case 3:
                    System.out.println("검색할 계좌번호를 입력하세요:");
                    Scanner sc2 = new Scanner(System.in);
                    String in = sc2.nextLine();

                    for (int i = 0; i < count; i++) {
                        if (in.equals(String.valueOf(accounts[i].account))) {
                            System.out.println(accounts[i] + "\n");
                        }
                    }
                    break;

                case 4:
                    System.out.println("삭제할 계좌번호를 입력하세요:");
                    Scanner sc3 = new Scanner(System.in);
                    if (sc3.equals("100")) {
                        System.out.println("계좌가 삭제되었습니다.");
                    }
                    break;

            }
        }
    }
}
