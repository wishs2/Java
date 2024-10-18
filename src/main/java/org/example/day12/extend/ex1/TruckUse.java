package org.example.day12.extend.ex1;

public class TruckUse {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.color = "red"; //car
        truck.speed = 200; //car
        truck.weight = 1; //truck
        System.out.println(truck);
        truck.start();
        truck.move();
        truck.end();
    }
}
