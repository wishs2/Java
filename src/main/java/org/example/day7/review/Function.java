package org.example.day7.review;

public class Function {

    int z; //전역변수는 자동으로 초기화가 됨

    public static void main(String[] args) {
        //저장공간을 만들고, 그 저장공간에 값을 만든다.
        //저장공간은 선언할 때 만들어진다.
        //타입명 변수명; -> 선언
        int x; //쓰레기 값이 들어있는 상태
        int y = 0; //변수 만들 때 초기화를 꼭 해줘야함

        //Java 에서는 선언의 위치가 이 변수가 사용될 수 있는 범위를 결정
        //x, y 변수는 main{} 메소드 내에서만 사용 가능
        //-->지역 변수(local)  =/전역 변수(global)

        for (int i = 0; i < 3; i++) {
            int imsi = 0; //for 문 밖에서는 사용 불가
        }//imsi도, i도 for문 지역 내에서만 쓸 수 있음
        //지역변수
    }
}
