package org.example.day3.array;

public class Array1 {
    public static void main(String[] args) {
        //배열을 만드는 방법 2가지

        /*
        공간을 여러개 만들 때(배열) 처음에 값을 모르는 경우
        유한 공간(갯수가 정해져있을 때)
        */
        int[] s = new int[5]; //{0,0,0,0,0}, 초기화 된 값의 목록이 생성
        //첫번째 값 프린트 s 안에 주소가 가르키고 있는 공간 / s[0] = s가 가르키고 있는 공간 첫번째 라는 뜻
        //두번째 s안에 주소가 가르키고 있는 공간 s[1]
        System.out.println("첫번째 값" + s[0]);
        System.out.println("두번째 값" + s[1]);

        s[0] = 100;
        System.out.println("첫번째 값" + s[0]);

        /*
        공간을 여러개 만들 때 처음부터 값을 알고 있는 경우
         */
        int[] s2 = {100, 200, 300, 400, 500};
        //5 가 저장된 변수(length)가 하나 더 있음(저장공간=변수명 + 공간 갯수 + length)=변수는 총 7개
        System.out.println("첫번째 값 " + s2[0]);
        System.out.println("두번째 값" + s2[1]);
        System.out.println(s2.length);


    }
}
