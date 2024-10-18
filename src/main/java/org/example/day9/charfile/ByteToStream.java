package org.example.day9.charfile;

import java.io.*;

public class ByteToStream {
    //글자를 써서 파일에 저장하고 싶습니다
    //FileWriter
    //글자를 써서 네트워크로 전송
    //네트워크 전송은 1바이트 단위로 전송할 예정
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //파일에 쓰기(String->byte 변환 저장
        try {
            OutputStream os = new FileOutputStream("C:/data/data.txt");
            Writer writer = new OutputStreamWriter(os,"UTF-8"); //브릿지 class
            writer.write("This is a test");
            writer.flush();
            writer.close();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();//자세히 에러 정보를 프린트
        }

        //파일 읽어오기(byte 단위 전송됨)
        //둘러싸주면서 surround-with 코드 완성해주는 단축키 : ctrl + alt + t

        try {
            InputStream is = new FileInputStream("C:/data/data.txt");
            Reader reader = new InputStreamReader(is);
            char[] data = new char[100];
            int num = reader.read(data);
            String str = new String(data, 0 ,num);
            System.out.println(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
