package org.example.day4.day4_review;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {

        //전체 문제풀이

        int[] term1 = {77, 88, 99, 55, 70};
        int[] term2 = {99, 100, 88, 80, 70};
        // 1. 성적이 2학기에 향상된 학생의 수를 카운트해서 프린트
        // 2. 성적이 1, 2학기 동일한 학생의 수를 카운트해서 프린트
        //c 타입의 for문 : i를 이용가능, 입/출력 가능, 여러개의 배열을 다룰 때
        //for-each 문 : 간단, 출력만 가능, 하나의 배열을 다룰 때
        //누적시키는 변수는 반복문 안에 넣으면 안된다.

        int count = 0, count1 = 0;
        for (int i = 0; i < term1.length; i++) {
            if (term1[i] < term2[i]) {//조건에 해당하는 구문은 결과가 무조건 논리형
                count++;
            }
            else if (term1[i] == term2[i]) {
                count1++;
            }
        }
        //for문이 끝났을 때 출력
        System.out.println( "2학기에 성적이 향상된 학생의 수 "+ count);
        System.out.println( "성적이 동일한 학생의 수 " + count1);

        System.out.println("--------------------");

        //2. 다음과 같이 값을 입력 받아 출력되도록 프로그래밍하시오.
        //숫자 입력 : 55
        // 숫자 입력 : 77
        //숫자 입력 : 11
        //----------------
        //합계 143
        //평균 47.666666667

        int[] num = new int[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.print("숫자 입력 : ");
            num[i] = sc.nextInt();
        }
        sc.close();

        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        double avg = (double)sum / num.length;

        System.out.println(Arrays.toString(num));
        System.out.println("숫자의 합계는 : " + sum);
        System.out.println("숫자의 평균은 : " + avg);

        System.out.println("--------------------");


        //3. random 한 값 1~1000까지 배열에 넣어 전체 출력(씨앗값 : 44)
        //3-1. 첫번째값, 세번째값, 다섯번째값, 100번째값, 990번째 값을 더한 결과값 출력
        //3-2. 전체 합계와 평균 출력
        int[] num1 = new int[1000];
        Random r = new Random(44);
        for (int i = 0; i < num1.length; i++) {
            num1[i] = r.nextInt(1000) + 1;
        }
        System.out.println("첫번째 값 " + num1[0]);
        System.out.println("세번째 값 " + num1[2]);
        System.out.println("다섯번째 값 " + num1[4]);
        System.out.println("백번째 값 " + num1[99]);
        System.out.println("990번째 값 " + num1[989]);

        int sum1 = num1[0] + num1[2] + num1[4] + num1[99] + num1[989];

        System.out.println("위 숫자들의 합은 " + sum1);

        int sum2 = 0;
        for (int num2 : num1) {
            sum2 += num2;
        }
        System.out.println("전체 숫자의 합계는 " + sum2);

        double avg1 = (double)sum2 / num1.length;
        System.out.println("전체 숫자의 평균은 " + avg1);

        System.out.println("--------------------");

        //4. 다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
        //(단, 다음에서 입력한 답이 1이면 열차, 2이면 배, 3이면 비행기를 타고 감.)
        //가고 싶은 곳 (보기, 1)백두산, 2)한라산, 3)후지산) 입력 >> 1
        //결과 출력은 당신이 가고 싶은 곳인 백두산은 열차를 타고 가야합니다.

        Scanner sc1 = new Scanner(System.in);

        System.out.println("보기 1)백두산, 2)한라산, 3)후지산");

        int choice = sc1.nextInt();
        String result = null;

        switch (choice) {
            case 1:
                result = "백두산은 열차";
                break;
            case 2:
                result = "한라산은 배";
                break;
            case 3:
                result = "후지산은 비행기";
                break;
            default:
                result = "X";
        }
        sc1.close();

        System.out.println("당신이 가고싶은 곳인 " + result + "를 타고 가야합니다.");

        System.out.println("--------------------");

        //5. random한 값 1부터 100까지 배열에 넣어 전체 출력(씨앗값 : 555), length는 1000
        //80이상인 개수, 70~79인 수 개수, 50~69인 수 개수, 49보다 작은 수 개수 카운트하여 출력
        int[] r = new int[1000];
        Random rand = new Random(555);
        int randIndex = rand.nextInt(100);
        int count = 0, count2 = 0, count3 = 0, count4 = 0;
        for (int i = 0; i < r.length; i++) {
            r[i] = rand.nextInt(100) + 1;
            if (r[i] >= 80) {
                count++;
            } else if (r[i] >= 70) {
                count2++;
            } else if (r[i] >= 50) {
                count3++;
            } else {
                count4++;
            }
        }
        System.out.println("80이상인 숫자의 개수는 " + count + "개");
        System.out.println("70이상 80미만인 숫자의 개수는 " + count2 + "개");
        System.out.println("50이상 70미만인 숫자의 개수는 " + count3 + "개");
        System.out.println("49 이하인 숫자의 개수는 " + count4 + "개");
    }
}
