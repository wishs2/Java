package org.example.day4.array_deep;

import java.util.Arrays;
import java.util.Random;

public class ArrayPattern {
    public static void main(String[] args) {
        //1. 배열을 만들어서 나중에 반복문으로 데이터 많이 넣기
        //2. 배열에 있는 값을 꺼내어 누적
        //3. 배열에 있는 값을 반복해서 처리하는데 조건이 있는 경우(if, switch)
        //4. 배열에 있는 값을 가지고 위치를 찾는 경우

        int[] jumsu = new int[5];

        //1. 배열을 만들어서 나중에 반복문으로 데이터 많이 넣기
        Random r = new Random(100); //랜덤으로 값을 만들어줌 //()씨앗값

        for (int i = 0; i < jumsu.length; i++) {
//            String data = JOptionPane.showInputDialog("점수 입력"); // 대화하기 위한 조그마한 창을 띄움
//            jumsu[i] = Integer.parseInt(data); // 입력 받은 데이터는 모두 스트링으로 인식 따라서 정수로 타입을 변경(형변환)

            // parse는 분석하다는 뜻 입력한 값에서 숫자만 분석하여 변환
            // 많이 쓰는 변수는 램에 이미 저장되어있기 때문에 대문자로 접근하여 사용 ( Static)
            //jumsu[i] = 100;

            jumsu[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(jumsu)); //배열에 있는 데이터를 하나로 묶어서 출력해줌

        //2. 배열에 있는 값을 꺼내어 누적
        int sum = 0;//누적하는 변수는 반복문 내에 넣지 않는다!!
        for (int x : jumsu) {
            sum += x; // sum = sum + x 앞의 sum : 새 값까지 누적된 값/뒤의 sum : 이전까지 더해진 값

        }
        System.out.println(sum);

        // 3. 배열에 있는 값을 반복해서 처리하는데 조건이 있는 경우
        int sum2 = 0;
        for (int x : jumsu) {
            if (x >= 80) {
                sum2 = sum2 + x; // (= sum += x;)
            }
        }
        System.out.println(sum2);

        //4. 배열에 있는 값을 가지고 위치를 찾는 경우
        for (int i = 0; i < jumsu.length; i++) {

            if(jumsu[i] == 88){
                //88 이 하나인 경우
                System.out.println("88 발견");
                System.out.println(i + 1 +"번째에 있음"); //인덱스 (위치) 를 나타냄
                break; //if 안에 있는 break 는 반복문을 멈춰 주는 것
            }
        }
    }
}
