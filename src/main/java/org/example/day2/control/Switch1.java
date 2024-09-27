package org.example.day2.control;

public class Switch1 {
    public static void main(String[] args) {
        int day = 5;
        switch (day) { //실수와 큰 숫자long은 안됨/ 캐릭터, 스트링은 가능
            case 1: case 6:
                System.out.println("주말");
                break;
            case 2: case 3: case 4: case 5:
                System.out.println("평일");
                break;
        }
    }
}
