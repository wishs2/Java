package org.example.day8.classmade;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        Practice practice = new Practice();

        int n1 = practice.add(300, 200);
        System.out.println("더한 값: " + n1
        );

        int[] n2 = practice.add();
        System.out.println(n2[0]);

        //배열 전체 값 출력
        //1. for (int i~) : 입출력
        //2. foreach (int x : 배열명) : 출력만
        //3. Arrays.toString(배열명)
        System.out.println(Arrays.toString(n2));

        String result = practice.add("오늘은 ", 10);
        System.out.println(result);

        int month = practice.call();
        System.out.println("오늘은 " + month + "월 입니다.");
    }
}
