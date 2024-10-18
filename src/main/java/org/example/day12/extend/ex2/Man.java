package org.example.day12.extend.ex2;

public class Man extends Human {
    int power;

    public Man(String name, String gender, int power) {
        //항상 맨 첫줄에 super 써야함
        super(name, gender);
        this.power = power;
    }

    //상속 받는 클래스에서 생성자 호출시 부모 객체부터 먼저 만들어야 파생이 되므로
    //부모 클래스의 생성자부터 먼저 호출해야함.

    public void run(){
        System.out.println("Running");
    }
}
