package org.example.day4.array_deep;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayApply {
    public static void main(String[] args) {
//        //1
//        int[] term1 = {77, 88, 99, 55, 70};
//        int[] term2 = {99, 100, 88, 80, 70};
//
//        int count1 = 0, count2 = 0;
//        for (int i = 0; i < term1.length; i++) {
//            if (term1[i] < term2[i]) {
//                count1++;
//            }
//            if (term1[i] == term2[i]) {
//                count2++;
//            }
//        }
//        System.out.println("2학기에 성적이 향상된 학생의 수 : " + count1);
//        System.out.println("1, 2학기 성적이 동일한 학생의 수 : " + count2);
//
//
//        //2
//        int[] score = new int[3];
//
//        Scanner sc = new Scanner(System.in);
//
//
//        for (int i = 0; i < score.length; i++) {
//            System.out.print("숫자 입력 : ");
//            score[i] = sc.nextInt();
//        }
//
//        sc.close();
//
//        System.out.println("---------------------");
//
//        int sum = 0;
//        for (int i = 0; i < score.length; i++) {
//            sum += score[i];
//        }
//
//
//        double avg = (double)sum / score.length; //정수와 정수의 연산의 결과는 정수로 표현되기 때문에
//        //실수의 결과를 얻기 위해서는 정수 중 하나를 실수로 형변환(casting)을 해주어야함
//
//        System.out.println("합계 : " + sum);
//        System.out.println("평균 : " + avg);
//
//        System.out.println("---------------------");
//
//        //3
//        int[] n = new int[1000];
//
//        Random r = new Random(44);
//        for (int i = 0; i < n.length; i++) {
//            n[i] = r.nextInt(1000) + 1;
//        }
//        System.out.println(Arrays.toString(n));
//        System.out.println("첫번째 값 : " + n[0]);
//        System.out.println("세번째 값 : " + n[2]);
//        System.out.println("다섯번째 값 : " + n[4]);
//        System.out.println("100번째 값 : " + n[99]);
//        System.out.println("990번째 값 : " + n[989]);
//
//        int sum1 = n[0] + n[2] + n[4] + n[99] + n[989];
//
//        System.out.println(sum1);
//
//        int sum2 = 0;
//        for (int n1 : n) {
//            sum2 += n1;
//        }
//        double avg1 = (double)sum2 / n.length; //casting 활용좀해;;;;
//
//        System.out.println(sum2);
//        System.out.println(avg1);
//
//        System.out.println("---------------------");

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

        //5
        int[] array = new int[1000];
        Random rand = new Random(555);
        int count = 0, count1 = 0, count2 = 0, count3 = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1;

            if (array[i] >= 80) {
                count++;
            }
            else if (array[i] >= 70) {//그냥 if 문을 쓰게 되면 80이상인 수까지 카운트 돼서 중첩됨
                count1++;
            }
            else if (array[i] >= 50) {
                count2++;
            }
            else {
                count3++;
            }
        }
        System.out.println(count);
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }
}
