package org.example.day8.calculate;

public class Cal {
    public static void main(String[] args) {
        Calculate cal = new Calculate();
        int result1 = cal.plus(100, 200);
        int result2 = cal.plus(1000, 2000);
        cal.minus(100, 200);

        //위에서 더했던 두 개의 값을 더해서 총합을 구하고 싶음
        //이런 경우에 반환 return이 필요함
        int total = cal.plus(result1, result2);
        System.out.println("두 번 더한 값" + total);
//        cal.tim();
//        cal.div();


        System.out.println(cal.plus(300, 200));

        System.out.println(cal.minus(300, 200));
        // void인 경우, 바로 출력할수도 연산도 불가능하다
    }
}
