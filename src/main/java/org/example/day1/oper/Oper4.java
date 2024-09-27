package org.example.day1.oper;

import javax.swing.*;

public class Oper4 {
    public static void main(String[] args) {
        //정수1 입력 - a 변수 저장 333
        // 정수 2 입력 - b변수 저장 222

        //입력을 받은 데이터를 int로 각각 변환하여 a2, b2로 저장
        //두 입력값의 평균을 구하시오.(실수로)

        String a = JOptionPane.showInputDialog("Enter First Number");
        String b = JOptionPane.showInputDialog("Enter Second Number");

        int a2 = Integer.parseInt(a);
        int b2 = Integer.parseInt(b);

        double result = (a2 + b2) / 2.0;
        System.out.println(result);
        JOptionPane.showMessageDialog(null, result);





    }
}
