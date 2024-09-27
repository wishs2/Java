package org.example.day1.oper;

import javax.swing.*;

public class Oper2 {
    public static void main(String[] args) {
      int x = 200;
      int y = 100;

      int sum = x + y; //정수 + 정수 = 무조건 정수
        System.out.println(sum);


        int div = y / x;
        //자바는 정적타입핑이라 정수변수를 실수변수로 바꿀수는 없음
        //cpu가 값을 가지고 와서 실수 변경해주어야 함
        System.out.println(div);


        double div2 = (double)y / x;
        System.out.println(div2);
        //cpu가 타입을 변환하는 것을 casting(캐스팅)이라고 함



    }
}
