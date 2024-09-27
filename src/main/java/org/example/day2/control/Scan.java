package org.example.day2.control;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        //수동 import --> alt+enter
        //실무에서는 잘 안 쓰나 코딩테스트, 학습용

        Scanner sc = new Scanner(System.in); //강물(통로)을 튼 것
        System.out.print("이름 : ");
        String name = sc.next(); //한 단어만 입력
        System.out.print("나이 : ");
        int age = sc.nextInt(); //스트링으로 입력 받은 것을 인트로
        System.out.print("몸무게 : ");
        double w = sc.nextDouble(); //스트링으로 입력 받은 것을 더블로

        System.out.println(name + " " + age + " " + w);

        sc.close(); //강물의 흐름을 막은 것, 반드시 막아주어야 함

    }
}
