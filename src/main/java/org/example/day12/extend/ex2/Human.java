package org.example.day12.extend.ex2;

public class Human {
    String name;
    String gender;

    public Human(String name, String gender) {
        //super(); --> 컴파일 할 때 무조건 생성자 첫줄은 super() 자동생성 됨
        this.name = name;
        this.gender = gender;
    }

    public void sleep() {
        System.out.println("Zzz");
    }
    public void eat() {
        System.out.println("Yummy");
    }


}
