package org.example.day9.ram;

public class CarUse {
    public static void main(String[] args) {
        Car car1 = new Car();

        //Car(틀, class) --new--> 객체 생성
        //car1: 클래스의 인스턴스, 객체 (Object)
        //new 로 객체 생성한 경우 멤버변수가
        //힙 영역에 만들어진다
        //new 할때마다(객체 생성할 때마다 각각의 멤버변수들이 힙 영역에 만들어진다.

        car1.size = 10;
        car1.speed = 20;
        //클래스의 인스턴스 car1 : 참조형 변수
        //주소(힙 영역) --> 필드 접근(.), 메서드 호출 가능

        //이미 스트링으로 묶여있기 때문에 출력만 해주면 됨
        car1.hi();
        int age = 100;
        System.out.println("내 나이는" + age);
    }
}
