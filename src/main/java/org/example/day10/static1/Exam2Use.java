package org.example.day10.static1;

public class Exam2Use {
    public static void main(String[] args) {
        Exam2 work1 = new Exam2("홍길동",25,'여');
        Exam2 work2 = new Exam2("김길동",24,'남');
        Exam2 work3 = new Exam2("송길동",26,'여');

        System.out.println("우리 회사의 직원수는 " + Exam2.count);
        System.out.println("직원들의 평균 나이는 " + Exam2.getAvg());

        System.out.println();

        System.out.println(work1);
        System.out.println(work2);
        System.out.println(work3);

    }
}
