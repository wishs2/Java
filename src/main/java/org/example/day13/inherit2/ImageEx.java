package org.example.day13.inherit2;

public class ImageEx extends Thread {
    String[] foods = {"1.png", "2.png", "3.png", "4.png", "5.png"};

    @Override
    public void run() {
        for (int i = 0; i < foods.length; i++) {
            System.out.println("배열 이미지: " + foods[i]);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("문제가 생김");
                e.printStackTrace();
            }
        }
    }
}
