package org.example.day6.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Exam4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 400);
        frame.getContentPane().setBackground(Color.YELLOW); //프레임에 색깔 넣는 방법

        Font font = new Font("굴림", Font.BOLD, 20);

        JLabel label = new JLabel();
        label.setText("오늘의 날짜");
        label.setFont(font);

        JLabel label2 = new JLabel();
        label2.setText("오늘의 제목");
        label2.setFont(font);

        JLabel label3 = new JLabel();
        label3.setText("오늘의 내용");
        label3.setFont(font);

        JTextField today = new JTextField(20);
        today.setFont(font);
        today.setForeground(Color.BLUE);

        JTextField title = new JTextField(20);
        title.setFont(font);
        title.setForeground(Color.BLUE);

        JTextField contents = new JTextField(20);
        contents.setFont(font);
        contents.setForeground(Color.BLUE);

        JButton save = new JButton("파일에 일기 저장");
        save.setFont(font);
        save.setBackground(Color.MAGENTA);
        save.setForeground(Color.BLUE);

        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 String today2 = (today.getText());
                 String title2 = (title.getText());
                 String contents2 = (contents.getText());

                System.out.println(today2 + "\n" + title2 + "\n" + contents2);

                JOptionPane.showMessageDialog(frame,  "오늘의 날짜: " + today2 + "\n오늘의 제목: " + title2 + "\n오늘의 내용: " + contents2);

                //파일을 만드는 부품 가지고 온 데이터를 파일에 저장
                try {
                    FileWriter file = new FileWriter(today2 + ".txt");
                    file.write(today2 + "\n");
                    file.write(title2 + "\n");
                    file.write(contents2 + "\n");
                    file.close();
                    JOptionPane.showMessageDialog(frame, "파일에 저장 되었습니다!");

                } catch (IOException ex) {
                        System.out.println("파일과 관련된 문제가 생김.");
                }
            }
        });

        FlowLayout layout = new FlowLayout();
        frame.setLayout(layout);

        frame.add(label);
        frame.add(today);
        frame.add(label2);
        frame.add(title);
        frame.add(label3);
        frame.add(contents);
        frame.add(save);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
