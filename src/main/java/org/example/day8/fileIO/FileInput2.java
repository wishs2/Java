package org.example.day8.fileIO;

import java.io.*;

public class FileInput2 {
    public static void main(String[] args) {
        try{
            InputStream is = new FileInputStream("C:/data/imsi2.txt");
            byte[] data = new byte[100];

            while(true) {
                int num = is.read(data);
                if(num == -1) break;

                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]);
                }
            }
            is.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
