package org.example.day12.extend.ex2;

public class WonderWoman extends Woman {
    int high;

    public WonderWoman(String name, String gender, int walk, int high) {
        super(name, gender, walk);
        this.high = 100;
    }

    @Override
    public String toString() {
        return "WonderWoman{" +
                "high=" + high +
                ", walk=" + walk +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
