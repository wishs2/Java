package org.example.day8.calculate;

public class Calculate {
    //필드 X
    //parameter = 매개변수 = 인자 / 인수 = 데이터 = argument x, y
    public int plus(int x, int y) {
        System.out.println("더하기 기능 처리 내용"); //call
        System.out.println(x + y); //call
        return x + y;
    }
    public int minus(int x, int y) {
        System.out.println("빼기 기능 처리 내용");
        System.out.println(x - y);
        return x - y;
    }
    public void tim(int x, int y) {
        System.out.println("곱하기 기능 처리 내용");
        System.out.println(x * y);
    }
    public void div(int x, int y) {
        System.out.println("나누기 기능 처리 내용");
        System.out.println(x / y);
    }
}
