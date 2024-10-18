package org.example.day12.extend.ex3;

public class BallPen extends Fancy {
    String thick;

    public BallPen(int price, String company, String thick) {
        super(price, company);
        this.thick = thick;
    }

    public void write() {
        System.out.println("쓰다.");
    }

    @Override
    public String toString() {
        return "BallPen{" +
                "thick='" + thick + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                '}';
    }
}

