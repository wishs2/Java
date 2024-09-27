package org.example.day2.control;

import javax.swing.*;
import java.awt.*;

public class GUI2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("Click Here");

        f.setTitle("프레임 연습");


        b.setBackground(Color.DARK_GRAY);
        b.setForeground(Color.white);

        Font font = new Font("Arial", Font.BOLD, 30);
        b.setFont(font);

        f.add(b);
        f.setSize(300, 300);

        f.setVisible(true);




    }
}
