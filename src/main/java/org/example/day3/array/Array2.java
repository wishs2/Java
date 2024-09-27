package org.example.day3.array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        //우리 가족 정보를 배열해보자
        //4명 / 이름, 나이, 키, 성별, 아침밥 여부


        //c-type for
        //스트링 배열(이름)
        String[] names = {"홍길동", "김길동", "김첨지", "김민식"};
        //System.out.println(names [0]);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " 님");
        }

        //for-each
        for (String s : names) {
            System.out.println(s);
        }

        //한 문자열로 이어서 출력. 한 눈에 보기 좋음
        System.out.println(Arrays.toString(names));


        //인트 배열(나이)
        int[] ages = {45, 43, 33, 21};
        for (int a = 0; a < ages.length; a++) {
            System.out.println(ages[a] + "세");
        }
        //for-each
        for (int a : ages) {
            System.out.println(a);
        }

        //인트 배열(키)
        int[] height = {175, 177, 180, 172};
        for (int h = 0; h < height.length; h++) {
            System.out.println(height[h] + "cm");
        }
        //for-each
        for (int k : height) {
            System.out.println(k);
        }

        //문자 배열(성별)
        char[] gender = {'남', '남', '남', '남' };
        for (int m = 0; m < gender.length; m++) {
            System.out.println(gender[m]);
        }
        //for-each
        for (char c : gender) {
            System.out.println(c);
        }

        //논리 배열(아침밥 여부)
        boolean[] f = {true, false, true, false};
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }
        //for-each
        for (boolean b : f) {
            System.out.println(b);
        }

        //error 예시

        //System.out.println(names[5]);
        //length 범위가 벗어났기 때문에 불러올 수 없음

        //System.out.println(names[names.length]);
        // length 의 위치가 5이기 때문에 -1을 한 4까지 해야 데이터를 불러올 수 있음

    }
}
