package org.example.day3.array;

import java.util.Arrays;
import java.util.Random;

public class Array_review {
    public static void main(String[] args) {
        //3일의 휴가기간 동안 매일 다른 곳을 여행 가려 함
        //1.여행 가고싶은 지역 3개를 배열에 넣기(처음부터 알고있는 경우)
        //2. 여행 지역마다의 경비(처음부터 알고있는 경우)
        //3. 함께 가고 싶은 사람 이름(처음에는 모름)
        //첫번째 여행지만 친구로 나중에 결정됨
        //다음과 같이 출력
        //제주도 50000 친구
        //울릉도 40000 null
        //송도 10000 동생

        String[] where = {"제주도", "울릉도", "송도"};

        int[] money = {50000, 40000, 10000};

        String[] with = new String[3];
        with [0] = "친구";

        //int i 의 역할 : 반복횟수 체크용, 배열의 인덱스, 계산대상 데이터용
        // 시작값, 증감값, 조건 - for 문 유한반복의 3요소
        for (int i = 0; i < where.length; i++) {
            System.out.println(where[i] + "\t" + money[i] + "\t" + with[i]); // " \t "  탭만큼 공백이 생김
        }

        System.out.println("----------------------");


        //1. 배열을 만들어서 나중에 반복문으로 데이터 많이 넣기
        int[] num = new int[10];

        Random r = new Random(55);

        for (int i = 0; i < num.length; i++){
            num[i] = r.nextInt(100) + 1;
        }

        System.out.println(Arrays.toString(num));
        //전체 요소를 묶어서 출력하는 것이기 때문에 Arrays.toString 사용 비파괴함수
        //Arrays.sort(num); 배열의 내용을 오름차순으로 정렬(작-->큰) 파괴함수
        //1-1. length 가 10인 int 배열 생성
        //1-2. Random 을 이용하여 값을 넣기(범위 1~100) / 시드값은 55
        //1-3. 생성된 배열 요소 전체 출력

        System.out.println("----------------------");

        //2. 배열에 있는 값을 꺼내어 누적
        //2-1. 감소하여 누적하는 변수 minus 선언하여 초기화
        //2-2. 배열에 있는 값을 꺼내어 계속 감소
        //2-3. minus 값 출력
        int minus  = 0;
        for (int n : num) {
            minus -= n;
        }
        System.out.println(minus);

        System.out.println("----------------------");

        //3. 배열에 있는 값을 반복해서 처리하는데 조건이 있는 경우
        // 3-1. 더해서 누적하는 함수 sum 선언하여 초기화
        //3-2. 배열에 있는 값 중 50보다 큰 것만 누적
        //3-3. sum 값 출력

        int sum2 = 0;
        for (int s : num) {
            if (s > 50){
                sum2 += s;
            }
        }
        System.out.println(sum2);

        System.out.println("----------------------");

        //4. 배열에 있는 값을 가지고 위치를 찾는 경우
        //4-1. 배열 내에 80보다 큰 값을 맨앞부터 하나만 찾아서 위치 프린트
        //4-2. 80보다 큰 값을 찾으면 반복문 종료

        for (int i = 0; i < num.length; i++) {
            if (num[i] > 80) {
                System.out.println(i);
                break;
            }
        }

        }
    }
