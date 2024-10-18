package org.example.day8.fileIO;

public class File {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("C:\\jdk-17\\bin"); //Font ("궁서", ), File 은 Stream 이기 때문에 꼭 닫아주어야함
        System.out.println(file.exists()); //논리값으로 출력
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        //Directory = 폴더 = 패키지
        System.out.println(file.listFiles());
        java.io.File[] list = file.listFiles();
        System.out.println(list.length);
        for(java.io.File f : list) {
            System.out.println(f.getName());
        }

        //절대경로 : 위치를 나타낼 때 맨앞에서부터 쭉 써주는 경로
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        System.out.println(file.getPath());

    }
}
