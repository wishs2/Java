package org.example.day13.exam2;

public class Exception1 {
    public static void main(String[] args) {
        try {
            String[] names = {"홍길동", "김길동"};
            System.out.println(names[10]);
            int[] ages = null;
            System.out.println(ages.length);
        } catch (Exception e) {
            System.out.println("예외 처리 완료");
        }
    }
}
