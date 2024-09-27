package org.example.day3.condition;

import org.example.day2.control.Switch1;

import java.util.Date;

public class Date1 {
    public static void main(String[] args) {
        //입력할때 자동으로 년/월/일, 시/분/초를 구분하여 데이터를 받고싶다.
        //자동 임포트 단축키 : ctrl + Shift + O
        Date date = new Date();
        int yy = date.getYear() + 1900; //년
        int mm = date.getMonth() + 1; //월
        int dd = date.getDate(); //일
        int ddd = date.getDay(); //요일

        int h = date.getHours(); //시
        int m = date.getMinutes(); //분
        int s = date.getSeconds(); //초


        System.out.println(yy + "년 " + mm + "월 " + dd + "일 " + h + "시 " + m + "분 " + s + "초 " + ddd + " ");

        //오늘은 무슨 요일인지 프린트

        int t1 = date.getDay();

        switch (t1) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("토요일");
                break;
            default:
                System.out.println("일요일");

        }

        //출력을 밑으로 다 몰아넣어도 되고 변수 사이에 출력을 해도 되나, 가독성을 위해 출력은 몰아서 해놓으면 좋다.


    }
}
