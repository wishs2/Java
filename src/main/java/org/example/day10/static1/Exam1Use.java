package org.example.day10.static1;

public class Exam1Use {
    public static void main(String[] args) {
        Exam1 day1 = new Exam1("자바공부",10,"강남");
        Exam1 day2 = new Exam1("여행",15,"강원도");
        Exam1 day3 = new Exam1("운동",11,"피트니스");

        System.out.println("Day1" + day1);
        System.out.println("Day2" + day2);
        System.out.println("Day3" + day3);

        System.out.println(Exam1.getSum());
        System.out.println(Exam1.getAvg());
    }
}
