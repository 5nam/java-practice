package org.example.section04;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;
        b = ++a; // a 값 먹저 증가 시키고, 그 결과를 b 에 대입
        System.out.println("a = " + a + ", b = " + b);

        // 후위 증감 연산자 사용 예
        a = 1;
        b = 0;
        b = a++; // a 의 형재 값을 b 에 먼저 대입하고, 그 후 a 증가
        System.out.println("a = " + a + ", b = " + b);
    }
}
