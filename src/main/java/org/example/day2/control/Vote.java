package org.example.day2.control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vote {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(300, 800);

        Font font = new Font("Arial", Font.BOLD, 30);
        FlowLayout flowLayout = new FlowLayout();
        f.setLayout(flowLayout);

        JLabel J1 = new JLabel();
        J1.setText("Vote");
        J1.setFont(font);

        f.add(J1);

        JButton b = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();

        b.setFont(font);
        b2.setFont(font);
        b3.setFont(font);

        //라벨 설정
        JLabel l2 = new JLabel();
        l2.setText("benz");
        l2.setFont(font);

        JLabel l3 = new JLabel();
        l3.setText("audi");
        l3.setFont(font);

        JLabel l4 = new JLabel();
        l4.setText("BMW");
        l4.setFont(font);

        //아이콘 설정
        ImageIcon icon = new ImageIcon("003.png");
        b.setIcon(icon);
        ImageIcon icon2 = new ImageIcon("001.png");
        b2.setIcon(icon2);
        ImageIcon icon3 = new ImageIcon("002.png");
        b3.setIcon(icon3);

        //
        f.add(b);
        f.add(l2);
        f.add(b2);
        f.add(l3);
        f.add(b3);
        f.add(l4);

        b.addActionListener(new ActionListener() {
            int b = 0; //얘는 임의로 선언한 0이랑 다름. / 버튼을 안 눌렀을 때 0으로 남아있어야 하기 때문에
            //의도적으로 0이란 값을 넣은 것.

            @Override
            public void actionPerformed(ActionEvent e) {
                b++; // b = b + 1; 2 이상부터는 수식으로
                l2.setText("benz" + b);
                System.out.println("벤츠 선택됨");

            }
        });

        b2.addActionListener(new ActionListener() {
            int a = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                a = a + 1;
                l3.setText("audi" + a);
                System.out.println("아우디 선택됨");
            }
        });

        b3.addActionListener(new ActionListener() {
            int bm = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                bm = bm + 1;
                l4.setText("bmw" + bm);
                System.out.println("BMW 선택됨");
            }
        });


        f.setVisible(true);

    }
}
