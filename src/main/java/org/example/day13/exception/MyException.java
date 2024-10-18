package org.example.day13.exception;

import java.lang.Exception;

public class MyException extends Exception {
    //Exception 의 Message 필드

    public MyException(String message) {
        super(message);
    }
}
