package org.example.day12.inherit;

public class Car extends Vehicle {
    int numDoors;

    public Car(String brand, String model, int numDoors) {
        super(brand, model);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public String display() {
        return super.display() + " " + numDoors;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\nModel: " + model + "\nNum Doors: " + numDoors;
    }
}
