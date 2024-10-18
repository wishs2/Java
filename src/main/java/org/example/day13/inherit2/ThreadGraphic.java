package org.example.day13.inherit2;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class ThreadGraphic extends JFrame {

    JLabel count, image, day;
    volatile boolean running = true;

    public ThreadGraphic() {
        setSize(700, 450);

        Font font = new Font("굴림", Font.BOLD, 35);

        count = new JLabel("카운트");
        image = new JLabel("이미지");
        day = new JLabel("년월일");

        count.setFont(font);
        image.setFont(font);
        day.setFont(font);

        FlowLayout layout = new FlowLayout();
        setLayout(layout);

        add(count);
        add(image);
        add(day);

        CounterThread2 c = new CounterThread2();
        c.start();
        ImageEx2 a = new ImageEx2();
        a.start();
        TimeTread2 t = new TimeTread2();
        t.start();


        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //클래스안에 끼워진 클래스(내부클래스, innerClass)
    //전역변수를 공유할 목적으로!
    public class TimeTread2 extends Thread {

        public void run() {
            for (int i = 0; i < 3000; i++) {
                System.out.println("time>> " + new Date());
                day.setText("Time>> " + new Date());
                try {
                    Thread.sleep(500); //(1초 : 1000, 0.5초(500)
                } catch (InterruptedException e) {
                    System.out.println("error");
                }
            }
        }
    }

    public class CounterThread2 extends Thread {

        public void run() {
            for (int i = 5; i > 0; i--) {
                System.out.println("counter" + i);
                count.setText("counter>> " + i);
                if (i == 500) {
                    Toolkit.getDefaultToolkit().beep();
                }
                if (i == 1) {
                    JOptionPane.showMessageDialog(count, "사용시간이 다 되었습니다. \n퇴실 부탁드립니다.");
                    running = false;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("error");
                }
            }
        }
    }

    public class ImageEx2 extends Thread {
        String[] foods = {"1.png", "2.png", "3.png", "4.png", "5.png"};

        @Override
        public void run() {
            for (int i = 0; i < foods.length; i++) {
                System.out.println("배열 이미지: " + foods[i]);
                ImageIcon ii = new ImageIcon(foods[i]);
                image.setIcon(ii);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김");
                }
            }
        }
    }
}
