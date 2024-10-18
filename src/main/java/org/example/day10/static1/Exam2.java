package org.example.day10.static1;

public class Exam2 {
    String name;
    int age;
    char gender;
    static int sum2;
    static int count;

    public Exam2(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        sum2 += age;
        count++;
    }

    public static int getSum() {
        return sum2;
    }

    public static double getAvg() {
        if (count == 0) return 0;
        return (double) sum2 / count;
    }



    public String toString() {
        return  name + " " + age + " " + gender;
    }
}
