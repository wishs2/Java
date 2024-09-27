package org.example.day3.array;

import java.util.Arrays;
import java.util.Date;

public class Array3 {
    public static void main(String[] args) {
        int[] a = new int[3];
        //주소가 들어가 있는 변수를 참조형 변수라 함(a변수)
        System.out.println(a);
        a[0] = 100;
        a[1] = 200;
        a[a.length - 1] = 300;

        //a[2] = 300;

        System.out.println(Arrays.toString(a)); //배열은 그대로 두고 배열에 들어있는 전체 개수를 가져와서
        //문자 배열로 묶어서 한번에 프린트

        System.out.println("-------------");


        int[] number = {11, 22, 33, 44, 55};

        System.out.println(number[0]);
        System.out.println(number[2]);
        System.out.println(number[number.length-1]);
        //우리는 마지막 인덱스가 어딘지 알지만 얘네들은 헷갈릴수도 있기 때문에 유지보수에 좋지 않음
        //length 를 이용해서 마지막 인덱스 설정

        System.out.println(Arrays.toString(number));

        System.out.println("-------------");

        double[] math = {11.1, 22.2, 33.3, 44.4, 55.5};

        double sum = math[0] + math[1];
        double sum2 = math[1] + math[4];

        System.out.println("첫+두 값 " + sum );
         //System.out.println("첫+두 값 " + (math[0] + math[1]));
        //따로 빼서 계산을 해주고 불러와도 되고, 소괄호 쳐서 우선 연산하게 할 수도 있다.

        System.out.println("첫+막 값" + sum2 );
        System.out.println(math.length);
        System.out.println(Arrays.toString(math));

        System.out.println("-------------");

        char[] w = new char[4];
        w[0] = '남';
        w[1] = '여';

        System.out.println(w[0]);
        System.out.println(w[1]);
        System.out.println(Arrays.toString(w));
        System.out.println(w.length);

        System.out.println("-------------");

        String[] line = new String[3];
        line[0] = "스위스";
        line[1] = "일본";
        line[2] = "바다 아무데나";
        System.out.println(Arrays.toString(line));
        System.out.println("내가 첫번째 가고싶은 곳은 " + line[1] + "이고,");
        System.out.println("마지막으로 가고싶은 곳은 " + line[0] + " 이다.");
        
        //배열은 고정된 값을 바꿀 수 없음. pdf 참고
        
    }
}
