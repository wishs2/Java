package org.example.day10.constructor;

public class TV {

    //필드
    int channel;
    int vol;
    boolean onOff;

    //입력 파라메터
    public TV(int channel, int vol, boolean onoff) {
        this.channel = channel;
        this.vol = vol;
        this.onOff = onoff;
    }

    //toString 재정의
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", vol=" + vol +
                ", onoff=" + onOff +
                '}';
    }
}
