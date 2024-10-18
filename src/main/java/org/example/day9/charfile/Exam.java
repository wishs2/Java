package org.example.day9.charfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam {
    public static void main(String[] args) {
        //1. 파일 복사
        try {
            InputStream is = new FileInputStream("C:/data/data.txt");
            OutputStream os = new FileOutputStream("C:/data/data2.txt");
            is.transferTo(os);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
