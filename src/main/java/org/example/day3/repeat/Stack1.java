package org.example.day3.repeat;

import javax.swing.*;

public class Stack1 {
    public static void main(String[] args) {
        //숫자 누적 - 누적용 변수는 반복문 안에 넣으면 안 됨
        int sum = 0; //누적용 변수
        for (int i = 100; i < 1000; i++) {
            sum += i; //sum = sum + 1; 와 같은 의미
        }
        //문자열 누적
        String sum2 = ""; //문자열 누적일 때 ""으로 초기화, null X

        for (int i = 0; i < 3; i++) {
           String word = JOptionPane.showInputDialog("과목 입력");
                   sum2 += word;
        }
        System.out.println(sum);
        System.out.println(sum2);

    }
}
