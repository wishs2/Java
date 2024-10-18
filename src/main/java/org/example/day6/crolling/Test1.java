package org.example.day6.crolling;

import org.jsoup.Jsoup;

import javax.swing.*;

public class Test1 {
    public static void main(String[] args) {
        Jsoup.connect("https://finance.naver.com/sise/");
        System.out.println("인터넷 사이트 연결 성공");

        System.out.println("-------------------------");

        JFrame f = new JFrame("업프레임");
        f.setSize(300, 300);
        JButton b = new JButton("나를 눌러!");
        //b.setText("나를 눌러!"); //함수, 메소드, 명령어는 입력 데이터
        f.add(b);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //종료 시키는 명령어
        f.setVisible(true);
    }
}
