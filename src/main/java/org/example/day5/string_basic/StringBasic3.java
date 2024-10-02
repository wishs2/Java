package org.example.day5.string_basic;

import java.util.Arrays;

public class StringBasic3 {
    public static void main(String[] args) {
        String all = "국어, 영어, 수학, 컴퓨터";
        String[] all2 = all.split(", ");
        System.out.println(Arrays.toString(all2)); //전체 출력
        for (int i = 0; i < all2.length; i++) {
            all2[i] = all2[i].trim(); //문자열을 하나씩 꺼내서 공백을 제거하고 다시 저장
        }
        System.out.println(all2.length); //스트링은 함수 이용, 배열은 length 이용
        //과목수(저장공간) 출력


        int count = 0;//누적함수는 반복문에 넣지 않음

        for (int i = 0; i < all2.length; i++) {
            if (all2[i].equals("컴퓨터")) {
                System.out.println(i); //"컴퓨터" 가 배열 어디에 위치해있는가?
            }
            if (all2[i].length() < 3) {
            count++;
            }
        } System.out.println(count); //과목명이 3글자 미만인 과목수는?
    }
}
