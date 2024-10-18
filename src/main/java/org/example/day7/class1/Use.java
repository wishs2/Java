package org.example.day7.class1;

public class Use {
    public static void main(String[] args) {
        Made tv = new Made();
        tv.powerOn();
        //tv.changeChannel();
        tv.powerOff();

        System.out.println(tv.size);
        System.out.println(tv.price);

        tv.size = "small";
        tv.price = 1000;
        tv.company = "LG";


    }
}
