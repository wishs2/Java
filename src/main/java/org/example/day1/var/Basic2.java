package org.example.day1.var;

public class Basic2 {
    public static void main(String[] args) {
        System.out.println("기본형 연습2");
        //기본형 4가지 : 정수, 실수, 문자 하나, 논리
       //가을이다, 관련된 데이터를 기본형으로 4가지 넣어보고 프린트
        // 상수도 추가. final을 붙임. 변수명을 대문자로!
        // char 는 홑따옴표 ''
        // 웬만한 건 소문자, class 파일 이름만 대문자

        int month = 9;
        double temperature = 22.5; //낙타표기법/뱀표기법, pakage, class, var
        char food = '감';
        boolean rain = false;
        final int END_MONTH = 11;


        System.out.println("가을 시작하는 달은 " + month);
        System.out.println("평균 기온은 " + temperature);
        System.out.println("제철 과일은 " + food);
        System.out.println("비가 자주 오나 " + rain);
        System.out.println("가을이 끝나는 달은 " + END_MONTH);

        month = 10;
        //값 변경

        //초기값 0 을 넣어주는 것을 초기화라고 함
        //변수는 반드시 초기화를 시켜주어야 합니당


    }
}
