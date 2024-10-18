package org.example.day6.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing3 {
    static int start = 2; //현재 위치

    //변수가 선언된 위치를 포함한 곳 안에서 사용 가능!
    //static 을 함께 붙여줘야 사용이 가능함
    public static void main(String[] args) {

        JFrame frame = new JFrame("웹툰 순위-네이버");
        frame.setSize(400, 440);
        //데이터 준비 -> 배열(같은 속성, 같은 타입, 데이터량이 많을 때 사용)
        String[] title = {"윈드 브레이커", "천재 타자", "펜 홀더", "위닝샷", "낫오버"};
        String[] img = {"1.png", "2.png", "3.png", "4.png", "5.png"};
        double[] jumsu = {9.2, 8.8, 8.7, 9.1, 8.5};

        JLabel top = new JLabel(title[2]);
        JLabel under = new JLabel(jumsu[2] + ""); //요구하는 타입은 String, 결합 연산자 중 하나라도 스트링이면 됨
        //정석은 String.valueOf(jumsu[2]); / 위는 꼼수
        JLabel center = new JLabel();
        ImageIcon icon = new ImageIcon(img[2]);
        //이미지는 gradle 이 있는 파일 위치에 함께 넣어줘야함
        center.setIcon(icon);

        JButton b1 = new JButton("<<");
        b1.addActionListener(new ActionListener() {
            //addActionListener(처리하는 부품) 는 버튼을
            //클릭했을 때 처리하는 기능을 더함
            public void actionPerformed(ActionEvent e) {
                //이 addPerformed()가 자동으로 내가 클릭했을 때 실행되는 부분
                if (start > 0) {
                    System.out.println("왼쪽 버튼");
                    start--; //1
                    top.setText(title[start]);
                    under.setText(jumsu[start] + "");
                    ImageIcon icon = new ImageIcon(img[start]);
                    center.setIcon(icon);
                } else {
                    JOptionPane.showMessageDialog(frame, "마지막 페이지입니다.");
                }
            }
        });

        JButton b2 = new JButton(">>");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (start < title.length - 1) {
                    System.out.println("오른쪽버튼");
                    start++; //3
                    top.setText(title[start]);
                    under.setText(jumsu[start] + "");
                    ImageIcon icon = new ImageIcon(img[start]);
                    center.setIcon(icon);
                } else {
                    JOptionPane.showMessageDialog(frame, "마지막 페이지입니다.");
                }
            }
        });

        Font font = new Font("굴림", Font.BOLD, 30);
        top.setFont(new Font("굴림", Font.BOLD, 30));

        top.setFont(font);
        under.setFont(font);
        center.setFont(font);
        b1.setFont(font);
        b2.setFont(font);

        b1.setBackground(Color.green);
        b2.setBackground(Color.green);
        b1.setForeground(Color.blue);
        b2.setForeground(Color.blue);

        frame.add(b1, BorderLayout.WEST);
        frame.add(b2, BorderLayout.EAST);
        frame.add(top, BorderLayout.NORTH);
        frame.add(under, BorderLayout.SOUTH);
        frame.add(center, BorderLayout.CENTER);


        //텍스트 3개 들어갈 자리(위, 아래, 포스터 이미지)
        //입력 -> 처리 -> 출력
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
