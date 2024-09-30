package org.example.day4.array_deep;

import java.util.Arrays;
import java.util.Random;

public class ArrayLotto {
    public static void main(String[] args) {
        int[] l = new int[6];
        Random r = new Random(42);
        for (int i = 0; i < l.length; i++) {
            l[i] = r.nextInt(45) + 1; //0~44->1~45
        }
        System.out.println(Arrays.toString(l));
        //카운트 누적 변수
        //패턴 3번
        int count = 0;
        for (int x : l) {
            if (x >= 15){
                count++;
            }
        }
        System.out.println(count);
    }
}
