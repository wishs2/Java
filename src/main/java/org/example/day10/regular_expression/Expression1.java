package org.example.day10.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression1 {
    public static void main(String[] args) {
        String pattern = "^[a-zA-Z]*$";
        String str1 = "abcde";
        String str2 = "zza1";
        String str3 = "1234";
        String str4 = "";

        System.out.println(Pattern.matches(pattern, "qwer"));

        boolean result = Pattern.matches(pattern, str1);
        boolean result2 = Pattern.matches(pattern, str2);
        boolean result3 = Pattern.matches(pattern, str3);
        boolean result4 = Pattern.matches(pattern, str4);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        //더 간략하게


        System.out.println("---------------------------");

        Pattern pattern1 = Pattern.compile("^[0-9]*$");

        String num1 = "asdf";
        String num2 = "1234";
        String num3 = "a1b2c3d4";
        String num4 = "";

        Matcher matcher1 = pattern1.matcher(num1);
        Matcher matcher2 = pattern1.matcher(num2);
        Matcher matcher3 = pattern1.matcher(num3);
        Matcher matcher4 = pattern1.matcher(num4);

        System.out.println(matcher1.find());
        System.out.println(matcher2.find());
        System.out.println(matcher3.find());
        System.out.println(matcher4.find());


    }
}
