package org.example.day13.exam3;

public class Laptop extends Tablet {
    private int batteryCapacity; // 배터리 용량
    private String color; // 색상

    public Laptop(int batteryCapacity, String color, int cameraResolution) {
        super(batteryCapacity, color, cameraResolution);
        this.batteryCapacity = batteryCapacity;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", color='" + color + '\'' +
                '}';
    }
}
