package org.example.day11.static2;

public class Ex {
    String name;
    String with;
    int time;
    static int count;
    private static int sum;

    public Ex(String name, String with, int time) {
        this.name = name;
        this.with = with;
        this.time = time;
        count++;
        sum = sum + time;
    }

    public static int getCount() {
        return count;
    }

    public static int getSum() {
        return sum;
    }

    public String toString() {
        return "Ex{" +
                "name='" + name + '\'' +
                ", with='" + with + '\'' +
                ", time=" + time +
                '}';
    }
}
