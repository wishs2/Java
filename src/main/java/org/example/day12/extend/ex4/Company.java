package org.example.day12.extend.ex4;

public class Company {
    public static void main(String[] args) {
        Manager m = new Manager("김첨지", "삼성동", 3, 020202, 500);
        System.out.println(m);

        m.test();
    }
}
