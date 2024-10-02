package org.example.day5.string_basic;

import java.util.Locale;

public class StringBasic {
    public static void main(String[] args) {
        String s = "나는 프로그래머야"; //인덱스를 가지고 있음. '나'는 0번
        String s2 = "진짜!!!";

        System.out.println(s + s2);

        String sum = s.concat(s2);
        System.out.println(sum);

        char c = s.charAt(0); //s 스트링에 들어있는 것 중 0번 인덱스에 있는 char 를 추출
        System.out.println(c);

        char c2 = s2.charAt(2);
        System.out.println(c2);// s2 스트링에 들어있는 것 중 2번 인덱스에 있는 char 를 추출

        System.out.println(s.endsWith("!")); //결과는 논리형으로 나옴 true/false
        System.out.println(s2.endsWith("!"));

        System.out.println(s.contains("!"));
        System.out.println(s2.contains("!"));

        System.out.println(s.substring(3, 8)); //내가 가지고 오려는 문자 +1
        System.out.println(s.substring(0, 2));
        //index
        System.out.println(s2.indexOf("!"));//index of 는 첫번째 위치
        System.out.println(s2.lastIndexOf("!")); //맨마지막 위치

        String s3 = "aliciawill@kakao.com";
        //aliciawill 만 추출
        //@위치를 찾는다
        //앞에서부터 @앞까지 추출


        int index = s3.indexOf("@");
        System.out.println(index);
        System.out.println(s3.substring(0, index));
        System.out.println(s3.startsWith("alicia"));


        //s3에 들어있는 것을 대문자로
        //s3에 들어있는 것 중 com을 net으로 변경
        //s3의 전체 글자수 프린트
        System.out.println(s3.toUpperCase(Locale.ROOT));
        System.out.println(s3.replace("com", "net"));
        System.out.println(s3.length());

        String s4 = " root";
        String s5 = "감자,고구마,양파";
        String s6 = "ABC";
        String s44 = s4.trim();
        System.out.println(s44.length());
        System.out.println(s44.equals("root"));//true
        System.out.println(s4.equals("root"));//false

        //스트링을 분리해서 배열에 넣어주기
        String[] data = s5.split(",");
        for (String data1 : data) {
            System.out.println(data1);
        }
//        System.out.println(data[0] + data[1] + data[2]);
        char[] data1 = s6.toCharArray();
        for (char data2 : data1) {
            System.out.println(data2);
        }

    }
}
