package org.example.day1.oper;

import javax.swing.*;
import java.sql.SQLOutput;

public class Oper1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("이름?");
        String age = JOptionPane.showInputDialog("몇 살?");

        System.out.println("너의 이름은 " + name + "군...");
        System.out.println( age + "살 그런가...");

        int age2 = Integer.parseInt(age);

        System.out.println(name + ", " + age2 + "살 이라...");

        //age2에 1을 더해서 age3에 넣었다가 프린트

        int age3 = age2 + 1;
        System.out.println(age3);




    }
}
