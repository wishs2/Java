package org.example.day13.exam3;

public class Tablet extends Smartphone{
    private int batteryCapacity; // 배터리 용량
    private String color; // 색상
    private boolean isConnected; // 연결 상태

    public Tablet(int batteryCapacity, String color, int cameraResolution) {
        super(batteryCapacity, color, cameraResolution);
        this.batteryCapacity = batteryCapacity;
        this.color = color;
        this.isConnected = false;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "batteryCapacity=" + batteryCapacity +
                ", color='" + color + '\'' +
                ", isConnected=" + isConnected +
                '}';
    }
}
