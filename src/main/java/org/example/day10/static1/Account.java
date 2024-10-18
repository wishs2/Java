//package org.example.day10.static1;
//
//public class Account {
//    String name;
//    String ssn;
//    int balance;
//    static int count;
//
//    // static 키워드가 붙어있는 변수는 객체생성과 상관없이 클래스에서 바로 접근해서 사용 가능한 변수
//    // 정적변수, static 변수, 클래스 변수
//    // 클래스명.변수명 접근해서 사용가능
//    // 클래스 변수 =\ 인스턴스 변수
//    // 1) 객체마다 공유할 목적으로(누적용)
//    // 2) 객체 생성하지 않고 언제든지 접근해서 사용할 목적으로
//
//    public Account(String name, int ssn, int balance) {
//        this.name = name;
//        this.ssn = ssn;
//        this.balance = balance;
//        count++;
//    }
//
//    public String toString() {
//        return "Account{" +
//                "name='" + name + '\'' +
//                ", ssn=" + ssn +
//                ", balance=" + balance +
//                '}';
//    }
//
//}
