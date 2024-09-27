package org.example.day2.control;

import java.util.Scanner;

public class Scan2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        //정수 2개를 입력 받아서 첫번째 숫자가 두번째 숫자보다 큰지 비교해서 출력
        System.out.print("첫번째 숫자: ");
        int x = sc.nextInt();
        System.out.print("두번째 숫자: ");
        int y = sc.nextInt();

        System.out.println( x + " " + y + " ");

        sc.close();

    }
}
