package org.example.day13.exception;

import java.lang.Exception;

public class AccountUse {
    public static void main(String[] args) throws Exception {
        Account account = new Account();
        try {
            account.money();
        } catch (Exception e) {
            System.out.println("예외 처리");
            e.printStackTrace();
        }
    }
}
