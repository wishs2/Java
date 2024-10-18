package org.example.day9.uml;

import java.io.*;

public class Exam3 {
    public static void main(String[] args) {

        try {
            InputStream is = new FileInputStream("C:\\NEW_JAVA\\JavaStudy\\build.gradle");
            Reader reader = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(reader);
            long start = System.nanoTime();
            while (true) {
                String line = br.readLine();
                if (line == null)
                    break;
                System.out.println(line);
            }
            long end = System.nanoTime();
            System.out.println(end - start);
            br.close();
            reader.close();
            is.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
