package org.example.day13.exam3;

public class Smartphone {
    private int batteryCapacity; // 배터리 용량
    private String color; // 색상
    private int cameraResolution; // 카메라 해상도

    public Smartphone(int batteryCapacity, String color, int cameraResolution) {
        this.batteryCapacity = batteryCapacity;
        this.color = color;
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "batteryCapacity=" + batteryCapacity +
                ", color='" + color + '\'' +
                ", cameraResolution=" + cameraResolution +
                '}';
    }

}