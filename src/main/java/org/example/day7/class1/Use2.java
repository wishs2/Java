package org.example.day7.class1;

public class Use2 {
    public static void main(String[] args) {
        Made2 dog = new Made2();

        dog.say();
        dog.sit();
        dog.walk();

        dog.name = "뭉치";
        dog.age = 2;
        dog.weight = 3.8;

        System.out.println();

        System.out.println(dog.name);
        System.out.println(dog.age + "살");
        System.out.println(dog.weight + "kg");
    }
}
