package org.example.day12.extend.ex3;

public class BallPenUse {
    public static void main(String[] args) {

        BallPen pen = new BallPen(3000, "제트스트림", "0.28");

        System.out.println(pen);

        pen.buy();
        pen.write();
    }
}
