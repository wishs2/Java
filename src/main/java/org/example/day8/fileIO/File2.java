package org.example.day8.fileIO;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class File2 {
    public static void main(String[] args) {
        //날짜, 제목, 내용을 입력해서
        //날짜별 파일에 저장
        //위치는 c:/data/날짜.txt로 저장
//        String s1 = JOptionPane.showInputDialog("날짜를 입력하세요.");
//        String s2 = JOptionPane.showInputDialog("제목을 입력하세요.");
//        String s3 = JOptionPane.showInputDialog("내용을 입력하세요.");

        Date date = new Date();
        String ymd = date.getYear() + 1900 + "" + (date.getMonth()+1)  + "" + date.getDate();
        String hms = date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds();


        String s = JOptionPane.showInputDialog("제목-내용 순서대로 입력");
        System.out.println(s);
        String[] total = s.split("-");
        String s2 = total[0];
        String s3 = total[1];


        //파일 생성하고 s1, s2, s3를 저장
        try {
            FileWriter f = new FileWriter("c:\\data\\" + ymd + ".txt"); //파일 경로를 쓰지 않으면
            // 프로젝트 밑으로 파일이 생성됨
            f.write(ymd + "\n");
            f.write(hms + "\n");
            f.write(s2 + "\n");
            f.write(s3 + "\n");

            //for 문
            for (String x : total) {
                System.out.println(x + "\n");
            }
            f.close(); //통로(자바-외부파일/네트워크 연결), 연결(connection)

            //Stream (강물)
        } catch (IOException e) {
            System.out.println("파일 다룰 때 에러가 발생함.");
            e.printStackTrace(); //에러 정보 구체적으로 프린트
            System.out.println(e.getMessage()); //에러 정보 간단하게 스트링으로 리턴
        }
    }
}
