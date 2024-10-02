package org.example.day5.string_basic;

public class StringBasic2 {
    public static void main(String[] args) {
        String tel = " 011-245-1234 ";
        tel = tel.trim(); //1 공백제거

        String[] tel2 = tel.split("-"); //2 하이픈을 기준으로 번호 분리

        for (String data1 : tel2) {
            System.out.println(data1);
        }
        switch (tel2[0]) {  //스위치
            case "011":
                System.out.println("SK");
                break;
            case "019":
                System.out.println("LG");
                break;
            default:
                System.out.println("Apple");
        }
//        if (tel2[0].equals("011")){   //If문
//            System.out.println("SK");
//        }else if (tel2[0].equals("019")){
//            System.out.println("LG");
//        }else {
//            System.out.println("Apple");
//        }
        if (tel2[1].length() >=4) {
            System.out.println("최신폰");
        } else {
            System.out.println("올드폰");
        }

        int sum = tel2[0].length() + tel2[1].length() + tel2[2].length();
        if (sum>=10) {
            System.out.println("유효한 전화번호");
        }else {
            System.out.println("유효하지 않은 전화번호");
        }
    }
}
