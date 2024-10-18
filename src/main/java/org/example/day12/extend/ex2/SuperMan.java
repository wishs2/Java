package org.example.day12.extend.ex2;

public class SuperMan extends Man {


    public SuperMan(String name, String gender, int power) {
        super(name, gender, power);
    }

    public void fly(){
        System.out.println("SuperMan Fly");
    }

    @Override
    public String toString() {
        return "SuperMan{" +
                "power=" + power +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
