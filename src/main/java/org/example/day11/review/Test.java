package org.example.day11.review;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] n = {3, 2, 7, 4};
        //정렬 오름차순

        Arrays.sort(n); //파괴형 메소드
        System.out.println(Arrays.toString(n));//비파괴형

        Random r = new Random();
        System.out.println(r.nextDouble());


        double n2 = Math.random();
        for (int i = 0; i < 5; i++) {
            System.out.println(n2);
            //0.0~0.999... 리턴 타입 더블
            System.out.println((int) ( n2 * 10) +1);

        }
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)+1);
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(now.getMonth());
        System.out.println("현재 시간 " + now.format(dtf));

        LocalDateTime result = now.minusYears(1);
        System.out.println("작년 오늘 " + result);

        LocalDateTime result2 = now.plusYears(1);
        System.out.println("내년 오늘 " + result2);



        //LocaldateTime을 이용해서 현재 날짜를 구하여라(시작일)
        //종료일을 구하세요. 2주후 날짜를 구하세요

        //종료일이 시작일 후이면, 아직 대여중입니다.
        //종료일과 시작일과 동일하면, 대여종료날입니다.

        LocalDateTime StartTime = LocalDateTime.of(2024,10,15,3,42);
        System.out.println("시작일 : " + StartTime.format(dtf));

        LocalDateTime EndTime = LocalDateTime.of(2024,11,15,3,42);
        System.out.println("종료일 : " + EndTime.format(dtf));

        if (StartTime.isBefore(EndTime)) {
            System.out.println("아직 대여중입니다.");
        }else if (StartTime.isEqual(EndTime)) {
            System.out.println("대여 종료날입니다.");
        }

        Date now1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(now1));

        sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(now1));

        sdf = new SimpleDateFormat("오늘은 E요일");
        System.out.println(sdf.format(now1));
        sdf = new SimpleDateFormat("올해의 D번째 날");
        System.out.println(sdf.format(now1));
        sdf = new SimpleDateFormat("이달의 W번째 주");
        System.out.println(sdf.format(now1));
    }
}
