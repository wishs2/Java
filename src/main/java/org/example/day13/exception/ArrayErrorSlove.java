package org.example.day13.exception;

import java.lang.Exception;

public class ArrayErrorSlove {
    public static void main(String[] args) {
        ArrayError ar1 = new ArrayError();
        try {
            ar1.array();
        } catch (Exception e) {
            System.out.println("직접 예외 처리");
        }
    }
}

