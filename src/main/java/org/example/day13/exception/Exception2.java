package org.example.day13.exception;

import java.lang.Exception;

public class Exception2 {
    public static void main(String[] args) {
        Problem4 error = new Problem4();
        try {
            error.call(); //에러가 있는 메서드를 호출
        } catch (Exception e) {
            System.out.println("너굴맨이 처리 했으니 안심하라구!");
        }
        System.out.println("에러 발생 후 실행 될까요?");
        System.out.println("에러 발생 후 실행 될까요?");
        System.out.println("에러 발생 후 실행 될까요?");
    }
}
