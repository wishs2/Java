package org.example.day13.inherit2;

public class CounterThread extends Thread {

    //필드
    //메서드 --> 기능이 중요

    //public void run(){} : 동시에 실행하고 싶은 내용
    //                      (비어있는 상태)

    //public void start(){} : JVM 은 실행 목록을 가지고 있음
    //          실행할 것들을 실행 목록에 리스트업 해두고
    //          스레드는 왔다갔다 하면서 조금씩 실행함


    public void run() {
        for (int i = 500; i > 0; i--) {
            System.out.println("counter" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("error");
            }
        }
    }
}
