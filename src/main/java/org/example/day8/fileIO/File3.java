package org.example.day8.fileIO;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class File3 {
    public static void main(String[] args) {
        //주말동안 할 일 입력받아 저장
        //할 일이 "운동" 이면 파일명은 "운동.txt"
        //저장 위치는 c:/data/운동.txt
        //입력은 2회 받음
        //1. 주말동안 할 일은?(예: 운동 ,코딩, 여행 등)
//                                운동
        //2. 구체적인 내용 입력(예 : 장소-시간-내용을 입력)
//                                잠실 운동장-2시간-뛰기
        //3. 파일은 3개 이상 만들어지도록 처리
        String s = JOptionPane.showInputDialog("주말동안 할 일은?");
        String s1 = JOptionPane.showInputDialog("구체적인 장소-시간-내용을 입력하세요.");
        String[] total = s1.split("-");
        String s2 = total[0];
        String s3 = total[1];
        String s4 = total[2];

        try {
            FileWriter f = new FileWriter("c:\\data\\" + s + ".txt");

            for (String x : total) {
               f.write(x + "\n");
           }

            f.close();

        } catch (IOException e) {
            System.out.println("파일 다룰 때 에러가 발생함.");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
