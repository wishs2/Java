package org.example.day13.exception;

import java.io.FileWriter;
import java.io.IOException;

public class FileSave {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("c:/test.txt");
            //폴더나 파일은 읽기만, 읽기/쓰기 가능한 경우
            //리눅스로 서버 만들어서 폴더와 파일 변경해주어야 하는 경우가 있음
            file.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("나는 실행 될까요?");
    }
}
