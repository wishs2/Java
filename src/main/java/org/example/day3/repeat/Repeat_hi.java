package org.example.day3.repeat;

import java.util.Date;
import java.util.Random;

public class Repeat_hi {
    public static void main(String[] args) {

        //3번 환영합니다 출력
        //슷자를 100부터 200까지 출력
        //Random 한 정수값 5개 출력 범위 : 0~99

        for (int d = 0; d <= 3; d++) {
            System.out.println("환영합니다.");
        }

        int i = 100;
        for (int j = 100; j <= 200; j = j + 1) { // = i++
            System.out.println(j);
        } //for

        Random rand = new Random();

        for (int n = 0; n < 5; n++) {
            int num = rand.nextInt(99) + 1;
            System.out.println(num);
        }


    } //main
} //class
