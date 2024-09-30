package org.example.day4.array_deep;

import java.util.Arrays;
import java.util.Random;

public class ArrayLotto2 {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        //랜덤한 값(시드값 42) 6개를 만들어서 넣으세요.
        //범위는 1부터 45까지
        //중복 제외
        Random r = new Random();

        for (int i = 0; i < lotto.length; i++) { //6번만 무조건 발생!!!

            int x = r.nextInt(45) + 1; //0~44 ==> 1 ~ 45, 20, 12

            boolean flag = false; //깃발값, 플래그 값 : true, false 에 따라

            for(int x2 : lotto){ //배열 안에 동일한 값이 이미 있는지 비교하는 반복문.

                if(x == x2){ //{20, 12, 4,0,0,0}
                    System.out.println("동일한 값 존재>");
                    i--;
                    flag = true;
                    break;
                }
            }
            if(!flag){
                lotto[i] = x;
            }
            System.out.println(Arrays.toString(lotto));
        }
        //  System.out.println(Arrays.toString(lotto)); //==> print(lotto);
    }
}