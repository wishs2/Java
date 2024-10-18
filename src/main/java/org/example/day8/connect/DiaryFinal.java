package org.example.day8.connect;

public class DiaryFinal {
    //속성 --> 항목(필드), 멤버변수
    public String title; //제목
    public String content; //내용
    public String date; //날짜
    public String weather; //날씨

    //기능 --> 메서드, 멤버 메서드
    //void : 없다
    public void write (){
        System.out.println("그림 하나 넣고,");
        System.out.println("제목 넣고, 내용 넣고, 날짜 넣고, 날씨 넣고");
    }
    public void del (){
        System.out.println("파일을 삭제하다");
    }
}
