package org.example.day13.exception;

public class Exception1 extends Throwable {
    public static void main(String[] args) {
        Problem3 error = new Problem3();
        error.call(); //에러가 있는 메서드를 호출
        System.out.println("에러 발생 후 실행 될까요?");
        System.out.println("에러 발생 후 실행 될까요?");
        System.out.println("에러 발생 후 실행 될까요?");
    }
}
