package org.example.day10.constructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class StringPrint {
    public static void main(String[] args) {
        //프린트 시 toString() 을 먼저 호출하여 프린트할 스트링을 만들고 나서
        //그렇게 만들어진 스트링을 프린트한다.
        int[] n1 = {1, 2, 3};//배열, 고정길이
        System.out.println(n1); //참조형 주소가 출력됨

        ArrayList list = new ArrayList(); //배열과 유사하나 가변
        list.add(100);
        list.add(200);
        System.out.println(list);

        HashSet set = new HashSet();//가변 + 중복제거
        set.add(100);
        set.add(100);
        set.add(200);
        set.add(300);
        System.out.println(set);


    }
}
