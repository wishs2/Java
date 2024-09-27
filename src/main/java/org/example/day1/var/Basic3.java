package org.example.day1.var;

public class Basic3 {
    public static void main(String[] args) {
        System.out.println("기본형 연습3");

        //기본형 4가지 : 정수, 실수, 문자1, 논리
        //정수 : byte(127), short, int, long

        byte age = 120; //+-128
        short count = 25000; //+-3만
        int money = 1000000; //+-21억
        long bank = 2222222222l; //22억 이상, L 붙여서 마무리

        //실수 : float, double
        float weight = 46.5f; //소숫점 7자리, 이하라면 f 붙여서 마무리
        double height = 159.6;

        String name = "홍길동"; //0글자 이상 입력 가능(문자열), 기본형 데이터가 아니기 때문에 대문자
        String job = "Java Developer";

        //내가 미래에 가질 재산 프린트(money + bank)
        //홍길동은 자바 프로그래머이다 프린드(name + job)

        System.out.println("내가 미래에 가질 재산은 " + (money + bank));
        System.out.println(name + "은 " + job + "이다.");




    }
}
