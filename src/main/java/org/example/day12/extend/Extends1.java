package org.example.day12.extend;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Extends1 {
    public static void main(String[] args) {
        //고정, 같은 타입 변수, 많은 수 -->배열
        //가변, 같은(다른)타입, 많은 수 -->ArrayList
        ArrayList list = new ArrayList();
        list.add(1000);
        list.add("볼펜");
        list.add(new Date());
        list.add(25.5);

        list.remove("볼펜");
        list.remove(0);
        System.out.println(list);

        System.out.println("-----------------");

        Object[] list2 = new Object[2];
        list2[0] = 100;
        list2[1] = "감사합니다";
        System.out.println(list2);
    }
}
