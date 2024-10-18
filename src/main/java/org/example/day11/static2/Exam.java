package org.example.day11.static2;

public class Exam {
    int account;
    String name;
    int money;

    public Exam(int account, String name, int money) {
        this.account = account;
        this.name = name;
        this.money = money;
    }

    public String toString() {
        return account + " " + name + " " + money;
    }
}
