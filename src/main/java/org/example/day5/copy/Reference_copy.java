package org.example.day5.copy;

import java.util.Arrays;

public class Reference_copy {
    public static void main(String[] args) {
        // 기본형과 참조형의 복사는 다르다.
        // 똑같이 값이 복사될 줄 알고 복사하면 주소만 복사됨
//        int[] term1 = {100, 200, 300};
//        int[] term2 = term1;
//

//        System.out.println(Arrays.toString(term1));
//        System.out.println(Arrays.toString(term2));

        int[] term1 = {100, 200, 300};
        int[] term2 = term1.clone();

        term2[0] = 96;

        System.out.println(Arrays.toString(term1));
        System.out.println(Arrays.toString(term2));
        System.out.println(term1 + " " + term2); //주소 복사, 각각 다른 주소가 출력됨

    }
}
