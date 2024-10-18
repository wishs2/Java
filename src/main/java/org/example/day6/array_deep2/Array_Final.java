package org.example.day6.array_deep2;

import javax.swing.*;

public class Array_Final {
    public static void main(String[] args) {
        //가로(행, row), 세로(열, column)
        //가로의 개수 : 2
        //한 행의 세로의 개수 : 3
        //개수(length, 길이, 사이즈) -> 인덱스는 0부터 시작
        int[][] seat = new int[2][3];

        seat[0][0] = 100;
        seat[0][2] = 200;
        seat[1][1] = 300;
        seat[1][2] = 400;

        System.out.println(seat[1][0] + " ");
        System.out.println(seat.length);
        //2차원 배열에서 배열명.length ->행의 개수
        System.out.println(seat[0].length); //0행의 열 개수
        System.out.println(seat[1].length); //1행의 열 개수

        for (int i = 0; i < seat.length; i++) {  //i는 행의 인덱스
            for (int j = 0; j < seat[i].length; j++) {  //j는 열의 인덱스
                System.out.print(seat[i][j] + " ");
                //i=0, j=0,1,2
                //[0][0]
                //[0][1]
                //[0][2]
                //i=1, j=0,1,2
                //[1][0]
                //[1][1]
                //[1][2]
            }
            System.out.println(); //한 행의 끝
        }

        System.out.println("---------------------");

        //배열을 만들 때 처음에 값을 모르고 있는 경우
        int[][] n2 = new int[3][]; //변수 개수는 5개, 총 메모리 20byte(n2, n2[0], n2[1], n2[2], length

        //1차원 배열 3개를 만들어서 껴보자.
        int[] r0 = new int[10];
        int[] r1 = new int[15];
        int[] r2 = new int[12];

        n2[0] = r0;
        n2[1] = r1;
        n2[2] = r2;

        System.out.println(n2[0].length);

        for (int i = 0; i < n2.length; i++) {
            //열의 개수는 행마다 구해서 반복
            //열의 개수보다 작을 때까지 반복
            for (int j = 0; j < n2[i].length; j++) {
                //1차원 배열의 마지막 위치
                System.out.print(n2[i][j] + " ");
            }
            System.out.println(); //안쪽 for 문이 끝나는 지점 / 한 행이 끝나는 지점
        }
        System.out.println("---------------------");

        //전체 프레임이 필요
        //new 를 이용해서 부품을 만들어 램에 넣어둠.

        //1. new JFrame(): JFrame 을 램에 넣어둔다.
        //2. f = new JFrame(): 램에 넣어둔 주소를 변수에 저장
        //3. JFrame f: f라는 변수에는 JFrame 이 들어있는 주소를 넣어두었다를 표시
        //   --> 이렇게 쓰면 f에는 JFrame 이 저장된 위치만 넣을 수 있고,
        //       다른 부품의 위치는 넣을 수 없음.

        JFrame f = new JFrame();
        f.setSize(500, 300);
        String header[] = {"장소", "누구와", "언제"};
        String contents[][] = {
                {"집", "가족", "수요일"},
                {"구월동", "친구", "수요일"},
                {"바다", "혼자", "수요일"}
        };
        JTable table = new JTable(contents, header);
        //JTable table = new JTable(2차원 배열 데이터, 1차원의 항목명);
        JScrollPane scroll = new JScrollPane(table);//스크롤을 만들 때 table 을 만들어서 넣음
        f.add(scroll);
        f.setVisible(true);
    }
}
