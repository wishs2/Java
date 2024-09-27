package org.example.day2.control;

import java.util.Scanner;

public class Scan3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("나의 이름은?");
        String name = sc.next();

        System.out.print("나의 키는?");
        double height2 = sc.nextDouble();

        System.out.print("나의 몸무게는?");
        double weight2 = sc.nextDouble();

        System.out.print("나는 저녁을 먹었나요?");
        boolean dinner1 = sc.nextBoolean();

        sc.nextLine();
        System.out.print("나의 좌우명은?");
        String motive = sc.nextLine();


        System.out.println(name + " " + height2 + " " + weight2 + " " + dinner1 + " " + motive);

        sc.close();


    }
}
