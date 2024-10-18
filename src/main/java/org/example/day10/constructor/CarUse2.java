package org.example.day10.constructor;

public class CarUse2 {
    public static void main(String[] args) {
        Car2 car = new Car2("현대", "Black", 300);
        Car2 car2 = new Car2("volvo");
//        System.out.println(car.model + " " + car.color + " " + car.maxSpeed);
        System.out.println(car);
        }
    }
