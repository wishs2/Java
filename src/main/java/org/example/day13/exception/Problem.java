package org.example.day13.exception;

import java.lang.Exception;

public class Problem {
    public static void main(String[] args) {
        System.out.println("1. 작동 잘 될 예정");
        try {
            System.out.println("2. 문제 발생 코드" + 10 / 0);
        } catch (Exception e) {
            System.out.println("수학 실행할 때 문제 발생");
            e.printStackTrace(); //발생한 문제에 대해 구체적으로 프린트 (void)
            System.out.println(e.getMessage()); //간단하게 문제에 대해 String으로 리턴 (String)
        }
        System.out.println("3. 나는 과연 프린트 될까용?");
    }
}
