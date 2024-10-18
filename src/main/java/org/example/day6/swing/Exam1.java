package org.example.day6.swing;

import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        String[] title = {"Quiet Place", "Avengers:Endgame", "Inception", "Parasite", "Interstellar"};
        int[] view = {15000, 23000, 18000, 21000, 19000};

        for (int i = 0; i < title.length; i++) {
            System.out.println((i + 1) + ". " + title[i] + " - 조회수: " + view[i]);
        }

        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("정보를 확인하고 싶은 영화 번호를 선택하세요 (1-5):");
        int num = sc.nextInt();

        if (num >= 1 || num <= 5) {
            int index = num - 1; //배열 인덱스 번호 조정
            System.out.println("선택한 영화: " + title[index] + "\n조회수: " + view[index]);
        } else {
            // 입력값이 유효하지 않을 때 경고 메시지
            System.out.println("잘못된 입력입니다. 1에서 5 사이의 번호를 선택하세요.");
        }
        sc.close();
    }
}
