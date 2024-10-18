package org.example.day9.charfile;

import java.util.Scanner;

public class Exam2_BookInfo {
    public static void main(String[] args) {
        Exam2_Book[] book = new Exam2_Book[2];

        String[] title = {"happy", "smile"};
        String[] author = {"kim", "park"};
        String[] isbn = {"k100", "k200"};

        Scanner sc = new Scanner(System.in);
        System.out.println("책 제목, 작가, isbn 을 순서대로 입력하세요 >>");


        for (int i = 0; i < book.length; i++) {
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            if (s1.length == 3) {
                book[i] = new Exam2_Book();
            }else {
                System.out.println("입력이 올바르지 않습니다.");
        }

        System.out.println("-------등록된 도서관 책 목록-------");

            for (int j = 0; j < book.length; j++) {
                System.out.println( "Title: " + title[j] + ", Author: " + author[j] + ", ISBN: " + isbn[j] );
            }

        }
        sc.close();

    }
}
