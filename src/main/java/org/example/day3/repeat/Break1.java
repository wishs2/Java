package org.example.day3.repeat;

public class Break1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { //1~10

            if (i % 3 == 0) continue;
            //명령어가 하나일 때는 블럭으로 묶어줄 필요가 없음
            //그러나 유지보수 하기 좋은 코드를 위해서는 중괄호를 넣어주는 것이 좋음

            if (i == 8) break; //실무에서는 Break 를 많이 씀

            System.out.println(i);
        }



    }
}
