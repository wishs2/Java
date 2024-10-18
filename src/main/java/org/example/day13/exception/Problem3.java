package org.example.day13.exception;

import java.lang.Exception;

public class Problem3 {
    public void call() {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("예외처리 내가 함");
        }
    }
}
