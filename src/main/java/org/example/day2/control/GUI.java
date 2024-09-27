package org.example.day2.control;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main(String[] args) {
        JFrame z = new JFrame();
        JButton b1 = new JButton();
        JButton b2 = new JButton();

        b1.setText("Button");
        b2.setText("Button2");

        b1.setBackground(Color.BLUE);
        b2.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.red);
        b2.setForeground(Color.green);

        Font font = new Font("Arial", Font.BOLD, 40);
        b1.setFont(font);
        b2.setFont(font);



        FlowLayout z1 = new FlowLayout();
        z.setLayout(z1);
        //배치/물 흐르는 것처럼 순서대로 다 붙여주는 레이아웃



        z.add(b1);
        z.add(b2);

        z.setSize(300, 300);




        z.setVisible(true);
        //맨끝에



    }
}
