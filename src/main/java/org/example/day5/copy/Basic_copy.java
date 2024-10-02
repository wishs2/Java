package org.example.day5.copy;

public class Basic_copy {
    public static void main(String[] args) {
        int math1 = 100;
        int math2 = math1;
        //기본형 복사, 변수에 들어있는 값을 다른 변수에 넣어주는 것
        //값을 복사해서 넣어줌
        math2 = 96;
        System.out.println(math1 + " " + math2);

    }
}
