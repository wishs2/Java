package org.example.day4.array_deep;

import java.util.Random;

public class ArrayToeic {
    public static void main(String[] args) {
        int[] ans = new int[990];
        int[] myans = new int[990];
        // 블럭 안 잡고 한줄 복사 ctrl + d
        // 한줄 삭제는 ctrl + y

        Random r = new Random(); //완벽한 수 42, 왜인지는 모름

        for (int i = 0; i < ans.length; i++) {
        ans[i] = r.nextInt(4) + 1;
        myans[i] = r.nextInt(4) + 1;
        }

        System.out.println("번호 : \t 답안 \t 내답");

        System.out.println("--------------------");

        for (int i = 0; i < myans.length; i++) {
            System.out.println(i + 1 + ":\t" + ans[i] + "\t" + myans[i]);
        }
        int score = 0;
        for (int i = 0; i < myans.length; i++) {
            if (myans[i] == ans[i]) {
                score++;
            }
        }
        System.out.println(score);
    }
}
