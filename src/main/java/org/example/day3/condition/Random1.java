package org.example.day3.condition;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {

        //아무 값을 만들어주는 클래스
        Random r = new Random();

        int num = r.nextInt(45) + 1;

        System.out.println(num);


    }
}
