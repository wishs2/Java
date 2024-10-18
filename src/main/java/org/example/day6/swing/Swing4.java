package org.example.day6.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing4 {
    static int count = 0;
    static String sum = "";

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(560, 440);
        FlowLayout fl = new FlowLayout();
        f.setLayout(fl); //add 한 순서대로 물 흐르듯이 뒤에다 붙여줌
        Font font = new Font("굴림", Font.BOLD, 30);
        f.setFont(font);


        for (int i = 0; i < 100 + 1; i++) {
            JButton b1 = new JButton();
            b1.setText(i + "");
            f.add(b1);

            b1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //버튼 클릭했을 때 실행되는 내용
                    //버튼 클릭하면 ActionListener 안에 있는 actionPerformed 라는 함수가 자동 실행
                    String s = e.getActionCommand();
                    System.out.println(s); //버튼 위에 있는 글자를 가지고 옴
                    JOptionPane.showMessageDialog(f, s + "번 좌석 예약되었습니다.");
                    b1.setEnabled(false);
                    b1.setBackground(Color.black);
                    count++;
                    sum = sum + s;
                }
            });
        }

        JButton pay = new JButton();
        pay.setText("결제하기");
        f.add(pay);
        pay.setBackground(Color.yellow);
        pay.setForeground(Color.blue);

        pay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, count * 10000 + "원 결제금액입니다. \n 좌석번호는 " + sum + " ");
            }
        });
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
