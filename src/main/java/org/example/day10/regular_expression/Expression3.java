package org.example.day10.regular_expression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Expression3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //우리 회사 직원 정보를 입력 받아보자
        //입력값은 모두 sc.next() 스트링으로 받을 것
        System.out.println("이름 입력>> "); //한글입력 , 3-4글자
        //제대로 입력했다면 "이름 님 환영합니다" 출력
        //아니면 "다시 입력해야합니다" 출력
        //숫자만으로 이루어졌는지 확인
        //숫자로 이루어 졌으면 Integer.ParseInt()로 숫자 변환 후 만(-1)으로 계산해서 출력
        //영문+숫자+_언더바 포함한 5-8글자
        //new.com을 포함하고 있어야 함
        //유효하면 "이메일이 유효합니다."
        //유효하지 않으면 "이메일이 유효하지 않습니다." 출력

        String name = sc.next();
        Pattern pt1 = Pattern.compile("^[가-힣]{3,4}$");
        if (pt1.matcher(name).find()) {
            System.out.println(name + "님 환영합니다.");
        } else {
            System.out.println("다시 입력해야합니다.");
        }


        Scanner sc1 = new Scanner(System.in);
        System.out.println("나이 입력>> ");
        String age = sc1.next();
        int age1 = Integer.parseInt(age);
        int age2 = age1 - 1;
        Pattern pt2 = Pattern.compile("^[0-9]+$");
        if (pt2.matcher(age).find()) {
            System.out.println("당신의 만나이는 " + age2 + "살 입니다.");
        } else {
            System.out.println("숫자만 입력해야합니다.");
        }


        Scanner sc2 = new Scanner(System.in);
        System.out.println("이메일 입력>> ");
        String email = sc2.next();
        Pattern pt3 = Pattern.compile("^[a-zA-z0-9_]{5,8}@new\\.com$");
        if (pt3.matcher(email).find()) {
            System.out.println("이메일이 유효합니다.");
        } else {
            System.out.println("이메일이 유효하지 않습니다.");
        }

        sc.close();
        sc1.close();
        sc2.close();


    }
}
