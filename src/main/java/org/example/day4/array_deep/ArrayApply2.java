package org.example.day4.array_deep;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayApply2 {
    public static void main(String[] args) {

        //4
        Scanner sc1 = new Scanner(System.in);
        System.out.println("보기 1)백두산, 2)한라산, 3)후지산 ");
        int choice = sc1.nextInt();
        if (choice == 1) {
            System.out.println("당신이 가고 싶은 곳인 백두산은 열차를 타고 가야합니다.");
        } else if (choice == 2) {
            System.out.println("당신이 가고 싶은 곳인 한라산은 배를 타고 가야합니다.");
        } else { //위의 조건들이 만족하지 않을 때, 예외의 것이기 때문에 조건문을 사용하지 않음
            System.out.println("당신이 가고 싶은 곳인 후지산은 비행기를 타고 가야합니다.");
        }

        System.out.println("---------------------");

        //5
        int[] array = new int[1000];
        Random rand = new Random(555);
        int count = 0, count3 = 0, count4 = 0, count5 = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1;

            if (array[i] >= 80) {
                count++;
            }
            else if (array[i] >= 70) {//그냥 if 문을 쓰게 되면 80이상인 수까지 카운트 돼서 중첩됨
                count3++;
            }
            else if (array[i] >= 50) {
                count4++;
            }
            else {
                count5++;
            }
        }
        System.out.println(count);
        System.out.println(count3);
        System.out.println(count4);
        System.out.println(count5);
    }
}
