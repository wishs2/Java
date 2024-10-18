package org.example.day13.exception;

import java.lang.Exception;

public class Account {
    public void money() throws MyException {
        int n = 15000;
        if (n >= 10000) {
            throw new MyException("돈이 너무 많아요 <--부럽다...");
        }
    }
}
