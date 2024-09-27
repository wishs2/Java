package org.example.day2.control;

import javax.swing.*;

public class Order {
    public static void main(String[] args) {
        String id = "root";
        String pw = "1234";


        System.out.println(id.equals("root") && pw.equals("1234"));


        String id2 = null;
        String pw2 = null;


        id2 = JOptionPane.showInputDialog("id 입력");
        pw2 = JOptionPane.showInputDialog("pw 입력");

        System.out.println(id.equals(id2) && pw.equals(pw2));






        String answer = "맑음";
        System.out.println(answer.equals("맑음"));


        String answer2 = null;
        answer2 = JOptionPane.showInputDialog("날씨가 어때?");
        System.out.println(answer.equals(answer2));


        double temp = 20;
        double humid = 70;



        String temp2 = JOptionPane.showInputDialog("현재 온도");
        String humid2 = JOptionPane.showInputDialog("현재 습도");

        double temp3 = Double.parseDouble(temp2);
        double humid3 = Double.parseDouble(humid2);

        //입력 받은 스트링을 더블로 변환해주는 Double.parseDouble

        System.out.println(temp < temp3 && humid < humid3);

        JOptionPane.showMessageDialog(null, "날씨");


        //코드 포맷팅 ctrl+alt+ L


        double d = 12.3456789;
        System.out.println((int)d);






    }
}
