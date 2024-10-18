package org.example.day7.class1;

public class Made {
    //속성(특징, 특성) : attribute, property : 내가 클래스 만들 때 넣을 항목들
    //항목 : item, field(필드, *자바에선 주로 필드라고 함)
    //       사이즈, 가격, 제조회사 -> 멤버변수
    //        -다른 항목들을 선택할 수 있었지만 내가 선택한 이 항목으로 변수를 만들겠다.

    String size; //전역변수 자동 초기화, null 로 초기화
    int price; //전역변수, 기본형 변수, 0으로 초기화
    String company; //전역변수, 참조형변수, null 로 초기화

    //기능(동작) : function, method(절차, 방법)
    //전원을 켜다, 전원을 끄다, 채널을 바꾸다

    //멤버 method/ 내가 선택해서 만들겠다.
    public void powerOn(){
        //전원을 켜기 위한 방법과 절차를 쓴다
        System.out.println("Powered on");
    }
    public void powerOff(){
        //전원을 켜기 위한 방법과 절차를 쓴다
        System.out.println("Powered off");
    }
    public void changeChannel(){
        System.out.println("Changing channel");
    }

}
