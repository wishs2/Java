package org.example.day3.order;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        //입력
        //ram 에 데이터가 있어야 함.
        //int x = 100;

        //따로 입력 받는 경우도 있음. System->하드웨어 : 직접 입력
        //파일에서 데이터를 찾는 경우 파일명 입력

        Scanner sc = new Scanner(System.in); //입력 받기

        System.out.print("나이 입력>> "); //모든 입력은 타입을 String 으로 인식함
        int age = sc.nextInt(); // age 라는 저장공간에 입력 받은 문자를 정수로 변환하고 저장

        System.out.print("아침을 먹었는지 입력 : ");
        boolean result = sc.nextBoolean();

        //처리

        int nextAge = age + 1;

        String text = null; //임의로 저장공간을 만들고 값을 넣은 것-기본형 데이터를 제외한 모든 것

        if (result) {
            text = ("점심을 조금 먹어두 될듯");
        } else {
            text = ("점심을 많이 먹어두 될듯");
        }


        //출력

        System.out.println("내년 나이는 : " + nextAge + "세");
        System.out.println("아침식사 여부 결과 : " + text);

    }
}
