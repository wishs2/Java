package org.example.day3.array;

public class Array4 {
    public static void main(String[] args) {
        // 기본형 변수/ 참조형 변수 기본형 데이터 외의 것들을 참조형 변수라 생각하면 편함
        // 데이터를 주소로 저장해놓음. 대량의 데이터들을 저장해놓음 그런 영역을 힙(Heap 영역) 이라고 함
        int[] days = {1, 3, 4, 5, 6};
        String[] doing = new String[5];
        doing[0] = " 기깔나게 숨쉬기 ";
        doing[1] = " 맛있는 거 먹기 ";
        doing[2] = " 놀러가기 ";
        doing[3] = " 친구들이랑 놀깅 ";
        doing[4] = " 기깔나게 쉬기 ";
        double[] temp = {22, 20, 17, 19, 18};

//        System.out.println(days[0] + "  " + doing[0] + " " + tep[0]);
//        System.out.println(days[1] + " " + doing[1] + " " + tep[1]);
//        System.out.println(days[2] + " " + doing[2] + " " + tep[2]);
//        System.out.println(days[3] + " " + doing[3] + " " + tep[3]);
//        System.out.println(days[4] + " " + doing[4] + " " + tep[4]);

        for (int i = 0; i < temp.length; i++) {
            System.out.println(days[i] + "  " + doing[i] + " " + temp[i]);
        }

        //간단하지만 기능이 꺼내오는 용도로만 사용 가능함. 명령어가 단순하면 성능도 단순함
        for (double t : temp) {
            //tep 라는 배열을 앞에서부터 순서대로 있는지 체크해서 하나씩 꺼내어 t라는 변수에 넣어주는 for문(for-each)
            System.out.println(t);
        }



        }
    }
