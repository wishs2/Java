package org.example.day3.repeat;

import java.util.Date;

public class Repeat_While1 {
    public static void main(String[] args) {

        //유한반복 - 시작값, 조건, 증감값

        int i = 1; //시작값

        while (i <= 10) {//조건
            System.out.println(i);
            i++; //증감값
        } //블럭 닫은거 뭐 닫은건지 메모 (while)

        System.out.println("-----------------");

        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        } //for문

        System.out.println("-----------------");
        //무한반복은 거의 while 을 많이 씀
        while (true) { //조건을 쓰기 위해서는 논리형 데이터 결과값이 나오도록 해야함
            //조건이 참일 때 실행
            System.out.println("머리 어깨 무릎 배고파");
            Date d = new Date();
            int seconds = d.getSeconds();
            if (seconds > 30) {
                break;
            } //if
        } //while
    } //main
} //class
