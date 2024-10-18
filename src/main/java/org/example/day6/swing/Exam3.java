package org.example.day6.swing;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exam3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(310, 530);
        frame.setBackground(Color.GREEN);

        JLabel top = new JLabel();
        top.setText("일기장");
        Font font = new Font("굴림", Font.BOLD, 85);
        top.setFont(font);

        Font font2 = new Font("굴림", Font.BOLD, 25);

        JLabel id = new JLabel();
        id.setText("ID");
        id.setFont(font2);

        JLabel pw = new JLabel();
        pw.setText("Password");
        pw.setFont(font2);

        TextField id2 = new TextField(10);
        id2.setFont(font2);
        id2.setBackground(Color.GRAY);
        id2.setForeground(Color.WHITE);

        TextField pw2 = new TextField(10);
        pw2.setFont(font2);
        pw2.setBackground(Color.GRAY);
        pw2.setForeground(Color.WHITE);

        JButton ok = new JButton();
        ok.setText("OK");
        ok.setFont(font2);

        JButton delete = new JButton();
        delete.setText("Del");
        delete.setFont(font2);

        ImageIcon icon = new ImageIcon("ok_360.png");
        ImageIcon icon2 = new ImageIcon("del_360.png");

        ok.setIcon(icon);
        delete.setIcon(icon2);

        FlowLayout layout = new FlowLayout();
        frame.setLayout(layout);


        frame.add(top);
        frame.add(id);
        frame.add(id2);
        frame.add(pw);
        frame.add(pw2);

        frame.add(ok);
        frame.add(delete);

        //OK 버튼 - 아이디와 패스워드가 root,1234 가 맞는지 체크
        //PW 버튼 - 입력한 값 지우기 처리

        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String id3 = id2.getText();
                String pw3 = pw2.getText();

                if (id3.length() > 0 && pw3.length() > 0) {
                    if (id2.getText().equals("root") && pw2.getText().equals("1234")) {
                        JOptionPane.showMessageDialog(frame, "로그인 성공");
                    } else {
                        JOptionPane.showMessageDialog(frame, "땡 ㅋ");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "id, pw를 입력하세요.");
                }
            }
        });

        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                id2.setText("");
                pw2.setText("");
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
