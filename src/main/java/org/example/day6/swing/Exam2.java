package org.example.day6.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exam2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setBackground(Color.PINK);
        FlowLayout flow = new FlowLayout();
        frame.setLayout(flow);

        JLabel label = new JLabel("먹고 싶은 음식");
        TextField textField = new TextField();
        JButton button = new JButton("어디로 갈까?");

        JLabel label2 = new JLabel("당신의 나이는?");
        TextField textField2 = new TextField();
        JButton button2 = new JButton("나의 내년 나이는?");

        JLabel label3 = new JLabel("국어 점수");
        JLabel label4 = new JLabel("수학 점수");
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        JButton button3 = new JButton("두 과목 점수의 평균은?");

        String food = textField.getText();

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (food.equals("아메리카노")) {
                    JOptionPane.showMessageDialog(frame, "카페로 가세요.");
                } else {
                    JOptionPane.showMessageDialog(frame, "그러면 물을 마시세요.");
                }
            }
        });

        int age = Integer.parseInt(textField2.getText());
        int next = age + 1;

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "당신은 내년에 " + next + "살이 됩니다.");
            }
        });

        int score = Integer.parseInt(textField3.getText());
        int score2 = Integer.parseInt(textField4.getText());

        int sum2 = score + score2;

        double div = sum2 / 2.0;

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "평균 점수는 " + div + "점입니다.");
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.add(label2);
        frame.add(textField2);
        frame.add(button2);

        frame.add(label3);
        frame.add(textField3);
        frame.add(label4);
        frame.add(textField4);
        frame.add(button3);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
