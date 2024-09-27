package org.example.day3.repeat;

import javax.swing.*;

public class Stack2 {
    public static void main(String[] args) {
        /*
         1. 1부터 499까지 누적해서 프린트
         2. 1부터 100까지 중 4의 배수만 누적해서 프린트
         3. 500부터 1까지 2씩 감소하면서 5의 배수는 빼고 누적해서 프린트
         */
        int sum = 0;
        for (int n = 1; n < 500; n++) {
            sum += n;
        }

        //System.out.println(x++); x++후위연산자 - 앞에 있는 명령을 수행 후 연산)
        //이 문장이 수행할 역할은 2가지임. 1-출력, 2-증감연산자(+1 or -1)
        //인데 연산 기호가 뒤에 붙었다 해서 후위연산자(후순위, 미룬이)
        //반대로 앞에 붙으면 전위연산자 (거의 먼저 처리함, 연산자 우선순위 참고)

        System.out.println(sum);

        System.out.println("--------------");

        int n = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 4 == 0) {
                n = n + i;
            }
        }

        System.out.println(n);


        System.out.println("--------------");

        int r = 0;
        for (int e = 500; e > 0; e = e - 2) {
            if (e % 5 == 0) {
                continue;
            }
            r = r + e;
        }
        System.out.println(r);

    }
}
