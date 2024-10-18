package org.example.day10.constructor;

public class Car2 {
    //필드, 멤버변수
    String model;
    String color;
    int maxSpeed;

    //멤버 메서드
    public Car2(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    //Alt + Insert
    public Car2(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car2(String model) {
        this.model = model;
    }

    public String toString() {
        return "Car2{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
