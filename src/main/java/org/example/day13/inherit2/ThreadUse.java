package org.example.day13.inherit2;

public class ThreadUse {
    public static void main(String[] args) {
        //스레드 사용 3가지 단계
        //1. 스레드 상속받아 클래스 정의
        //2. 1에서 만든 스레드 클래스 객체 생성
        //3. 실행 대기줄에 등록

        CounterThread ct = new CounterThread();
        TimeThread tt = new TimeThread();
        ArrayThread st = new ArrayThread();

        ct.start();
        tt.start();
        st.start();

    }
}
