package org.example.day10.static1;

public class Exam1 {
    String work;
    int time;
    String place;
    static int sum;
    static int count;

    //객체생성시 멤버변수 초기화할 목적으로
    //생성자 메서드, 객체 생성시 자동 호출

    //생성자 메서드가 되기 위한 조건
    // 1) 클래스 이름과 무조건 동일해야한다
    // 2) 리턴 타입을 명시하면 자동호출 되지 않음

    // 3) 생성자의 특징
    //1. 오버로딩 할 수 있음
    //2. 프로그래머가 생성자를 하나도 명시하지 않으면 컴파일러가 하나를 추가해줌
    //3. public classname(){...} -> 입력 매개변수가 없는 메서드를 생성
    //   기본 생성자(default constructor) --> 입력 매개변수가 없는 생성자 메서드


    //멤버변수 초기화 생성자
    public Exam1(String work, int time, String place) {
        this.work = work;
        this.time = time;
        this.place = place;
        sum += time;
        count++;
    }

    public static int getSum() {
        return sum;
    }

    public static double getAvg() {
        if (count == 0) return 0;
        return (double) sum / count;
    }

    //멤버변수 프린트할 목적
    public String toString() {
        return work + ", " + time + ", " + place;
    }
    //이 클래스로 생성된 객체(참조형 변수, day)를 프린트 할 때
    //프린트 할 스트링으 자동으로 만들어주는 것
    //모든 클래스는 toString() 메서드 가지고 시작함


}
