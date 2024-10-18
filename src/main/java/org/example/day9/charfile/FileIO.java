package org.example.day9.charfile;

import java.io.*;


public class FileIO {
    public static void main(String[] args) {
        try {
            // 첫 번째 Reader 사용
            Reader reader1 = new FileReader("C:/data/imsi2.txt");
            int data;
            while ((data = reader1.read()) != -1) {
                System.out.print((char) data);
            }
            reader1.close(); // 리더를 닫습니다.

            System.out.println(); // 줄 바꿈

            // 두 번째 Reader 사용
            Reader reader2 = new FileReader("C:/data/imsi2.txt");
            char[] buffer = new char[256];
            while (true) {
                int num = reader2.read(buffer);
                if (num == -1) break;
                for (int i = 0; i < num; i++) {
                    System.out.print(buffer[i]); // 한 줄씩 출력
                }
            }
            reader2.close(); // 리더를 닫습니다.

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
