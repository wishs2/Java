package org.example.day3.array;


import java.util.Arrays;
import java.util.Scanner;

public class Array_review2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        for (int i = 0; i < n.length; i++) {
            System.out.print("숫자를 입력하세요.>> ");
            n[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(n); //오름차순 정렬, 맨앞 최솟값, 맨끝 최댓값
        System.out.println("최소값 : " + n[0]);
        System.out.println("최대값 : " + n[n.length - 1]);
        System.out.println(Arrays.toString(n));



        //해당 인덱스까지 최대값 넣는 변수 필요

        int max = n[0]; //최대값 찾기
        for (int i = 1; i <n.length; i++) { //for문 순회
            if (max < n[i]) { //if(max < n[i]) 이면, max = n[i]
                max = n[i];
            }
        }
        System.out.println("최고 점수는 : " + max + "점");

        int min = n[0];
        for (int i = 1; i <n.length; i++) {
            if (min > n[i]) {
                min = n[i];
            }
        }
        System.out.println("최소 점수는 : " + min + "점");
        }
    }
