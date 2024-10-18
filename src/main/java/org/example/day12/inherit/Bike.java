package org.example.day12.inherit;

public class Bike extends Vehicle {
    boolean hasCarrier;

    public Bike(String brand, String model, boolean hasCarrier) {
        super(brand, model);
        this.hasCarrier = hasCarrier;
    }

    public boolean hasCarrier() {
        return hasCarrier;
    }

    @Override
    public String display() {
        return super.display() + " " + hasCarrier;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\nModel: " + model + "\nHas carrier: " + hasCarrier;
    }
}
