package org.example.day9.ram;

public class Car {

    //필드 2개 (전역변수, 멤버변수) / 전역변수는 자동 초기화됨
    int size;
    int speed;

    //메서드 2개 (멤버 메서드)
    public String print(){
        return size + " " + speed;
    }
    public void hi(){ //메서드 정의 -->실행되지 않음. 호출했을 때 실행

        int temp = 10; //지역변수는 초기화를 해주지 않음, 기본형
        System.out.println("속도를 Speed up +" + temp);
        //내 클래스 내에서는 함수와 변수를 마음대로 불러서 쓸 수 있다.
        //외부에서는 참조형 변수 필요

        System.out.println(print());
    }
}
