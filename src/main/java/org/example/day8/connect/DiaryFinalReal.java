package org.example.day8.connect;

public class DiaryFinalReal {
    public static void main(String[] args) {
        DiaryFinal day1 = new DiaryFinal();
        //day1 --> 참조형 변수
        //주소를 가지고 필드접곤, 멤버 메서드 실행할 수 있음
        day1.title = "제목";
        day1.content = "내용";
        day1.date = "날짜";

        day1.write();
        System.out.println(day1.title + ": \n" + day1.content + ": \n" + day1.date + ": ");
    }
}
