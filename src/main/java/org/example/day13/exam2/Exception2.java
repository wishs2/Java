package org.example.day13.exam2;

import java.io.FileWriter;
import java.util.Scanner;

public class Exception2 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            FileWriter fileWriter = new FileWriter("c:/data/test.txt");
            fileWriter.write(sc.nextLine());
            fileWriter.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
