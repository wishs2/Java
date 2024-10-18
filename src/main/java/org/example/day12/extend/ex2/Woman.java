package org.example.day12.extend.ex2;

public class Woman extends Human {
    int walk;

    public Woman(String name, String gender, int walk) {
        super(name, gender);
        this.walk = walk;
    }
}
