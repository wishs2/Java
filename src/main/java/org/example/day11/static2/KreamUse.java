package org.example.day11.static2;

public class KreamUse {
    public static void main(String[] args) {
        Kream rank1 = new Kream(1, "아크테릭스",207000,18000);
        Kream rank2 = new Kream(2, "롱샴",125000,15000);
        Kream rank3 = new Kream(3, "유니클로",60000,1478);
        Kream rank4 = new Kream(4, "살로몬",96000,771);
        Kream rank5 = new Kream(5,"마뗑킴",125000,3939);

        System.out.println(rank1);
        System.out.println(rank2);
        System.out.println(rank3);
        System.out.println(rank4);
        System.out.println(rank5);

        System.out.println("--------------------------");

        System.out.println( "총 거래량 " + Kream.getSales());
    }
}
