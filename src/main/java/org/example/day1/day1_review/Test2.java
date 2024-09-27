package org.example.day1.day1_review;

public class Test2 {
    public static void main(String[] args) {
        int x = 333;
        int y = 222;
        int sum = x + y;
        int minus = x - y;
        int multiply = x * y;
        int divide = x / y;
        int mod = x % y;

        System.out.println("sum = " + sum);
        System.out.println("minus = " + minus);
        System.out.println("multiply = " + multiply);
        System.out.println("divide = " + divide);
        System.out.println("mod = " + mod);

        //피연산자가 하나라도 스트링이면 결합연산자
        //산술연산자는 정수+정수 계산의 결과는 무조건 정수
        //산술연산자는 하나라도 실수이면 결과는 무조건 실수

        //비교연산자, 논리연산자의 결과는 무조건 논리형 데이터(T/F)

        System.out.println(x == y);
        System.out.println(x >= y);

        //논리연산자 (&&,||, !)

        char id = 'a';
        char pw = 'b';

        System.out.println(id == 'a' && pw == 'b');
        System.out.println(id == 'a' && pw == 'c');

        //and (&&)

        char pw1 = 'j';
        char pw2 = 'k';
        System.out.println(pw1 == 'j' || pw2 == 'k' );

        //or (||)




    }
}
