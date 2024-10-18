package org.example.day9.charfile;

import java.io.*;

public class Buffer {
    public static void main(String[] args) {

        try {
            InputStream is = new FileInputStream("C:/data/imsi2.txt"); //네트워크
            Reader reader = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(reader);

            while (true) {
                String line = br.readLine();
                if (line == null) break;
                System.out.println(line);
            }
            is.close();
            reader.close();
            br.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
