package org.example.day3.condition;

public class Cast1 {
    public static void main(String[] args) {
        //타입이 다른 변수에 넣어야 하는 경우
        //자동 형변환과 강제 형변환

        /*
        묵시적(자동) 형변환
        작은 공간에 있던 데이터를 큰 공간에 넣을 때는 자동으로 변환이 됨.
        눈에 보이지 않기 때문에 묵시적.
         */

        byte x = 100;
        int y = x;
        System.out.println(x + " " + y);

        /*
        명시적(강제) 형변환
        큰 공간에 있던 데이터를 작은 공간에 넣을 때(CPU 가 작업함)
        캐스팅을 해주기 때문에 명시적
         */

        int z = 100; //(4byte 공간을 쓰던 숫자기 때문에 자동으로 변환이 안됨) -128~127
        byte y2 = (byte) z; //따라서 캐스팅을 해주는 것

        System.out.println(z + " " + y2);


    }
}
