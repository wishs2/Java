package org.example.day12.debugger;

public class Example2 {
        public static void main(String[] args) {
            int a = 5;
            int b = 10;
            int result = add(a, b);
            System.out.println("결과: " + result);
        }
        public static int add(int x, int y) {
            int sum = x + y;
            return sum;
        }
}
