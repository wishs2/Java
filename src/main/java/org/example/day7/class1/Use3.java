package org.example.day7.class1;

public class Use3 {
    public static void main(String[] args) {
        Made3 tv = new Made3();
        Made3 tv2 = new Made3();
        //method 는 생성된 객체의 주소만 있으면 됨
        tv.채널을바꾸다();
        tv2.유튜브보다();
        tv.ch = 7;
        tv.vol = 9;
        tv.onOff = true;

        tv2.ch = 9;
        tv2.vol = 12;
        tv2.onOff = true;

    }
}
