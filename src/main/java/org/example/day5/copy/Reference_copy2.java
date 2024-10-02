package org.example.day5.copy;

import java.util.Arrays;

public class Reference_copy2 {
    public static void main(String[] args) {
       String[] a = {"국어", "영어", "수학", "컴퓨터", "회화"};
        int[] term1 = {44, 66, 22, 99, 100};
        int[] term2 = term1.clone();

        term2[0] = 22;
        term2[2] = 88;

        for (int i = 0; i < term1.length; i++) {
            System.out.println(term1[i] + " " );
        }
        System.out.println( );

        for (int i = 0; i < term2.length; i++) {
            System.out.println(term2[i] + " " );
        }
        System.out.println( );
        int count = 0;
        for (int i = 0; i < term1.length; i++) {
            if(term1[i] == term2[i]) {
                count++;
            }
        }
        System.out.println("동일한 성적 과목수 : " + count +"개");
        int count2 = 0;
        int index = 0;
        for (int i = 0; i < term2.length; i++) {
            if(term1[i] < term2[i]) {
                count2++;
                index = i;
            }
        }
        System.out.println("성적이 오른 과목수 : " + count2 + "개");

        if (count2 > 0) {
            System.out.println("성적이 오른 과목명 : " + a[index]);
        }
    }
}
