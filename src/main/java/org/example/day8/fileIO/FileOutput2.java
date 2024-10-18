package org.example.day8.fileIO;

import java.io.*;

public class FileOutput2 {
    public static void main(String[] args) {
        try{
            OutputStream os = new FileOutputStream("c:/data/imsi2.txt");
            byte[] array = {10, 20, 30};

            os.write(array);

            os.flush();
            os.close();
            }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
