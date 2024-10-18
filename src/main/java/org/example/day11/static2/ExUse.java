package org.example.day11.static2;

public class ExUse {
    public static void main(String[] args) {
        Ex w1 = new Ex("테니스","친구",3);
        Ex w2 = new Ex("러닝","동네모임",2);

        System.out.println(w1);
        System.out.println(w2);

        System.out.println("총 " + Ex.getSum() + "시간");
        System.out.println("총 " + Ex.count + "번");
    }
}
