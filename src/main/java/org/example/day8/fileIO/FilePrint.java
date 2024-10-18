package org.example.day8.fileIO;

import java.io.*;

public class FilePrint {
    public static void main(String[] args) {
       try {
           InputStream is = new FileInputStream("C:/data/imsi.txt");
           while (true) {
               int data = is.read();
               if (data == -1) break;
               System.out.print(data);
           }
           is.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
