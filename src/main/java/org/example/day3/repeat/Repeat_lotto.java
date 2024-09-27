package org.example.day3.repeat;

import java.util.Random;

public class Repeat_lotto {
    public static void main(String[] args) {

        //의사 임시값

        Random rand = new Random();
        //rand.setSeed(45); //시드값, 씨앗값

        for (int i = 0; i < 6; i++) {
            int num = rand.nextInt(45) + 1;
            System.out.println(num);
        }

    }

}
