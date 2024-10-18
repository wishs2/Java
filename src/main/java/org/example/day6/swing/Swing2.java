package org.example.day6.swing;

import javax.swing.*;
import java.awt.*;

public class Swing2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("이제 곧?");
        frame.setSize(300, 200);

        JButton b = new JButton("밥 먹을 시간!");
        b.setForeground(Color.white);
        b.setBackground(Color.DARK_GRAY);

        //JFrame 은 윗쪽, 왼쪽, 가운데, 오른쪽, 아랫쪽 중에서 선택해서 넣을 것으로 기본 설정 되어있음
        //위치를 정해주지 않으면 가운데로 계속 덮어씀

        JButton b2 = new JButton("HaHAHAHAHAHahahahahAHA");
        b2.setForeground(Color.yellow);
        b2.setBackground(Color.DARK_GRAY);

        frame.add(b, BorderLayout.NORTH); //버튼 위치
        frame.add(b2, BorderLayout.SOUTH);

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
