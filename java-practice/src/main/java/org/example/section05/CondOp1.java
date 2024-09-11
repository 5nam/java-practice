package org.example.section05;

public class CondOp1 {
    public static void main(String[] args) {
        // if - else
        int age = 18;
        String status;
        if (age >= 18) {
            status = "성인";
        } else {
            status = "미성년자";
        }
        System.out.println("age = " + age + " status = " + status);

        // 삼항 연산자
        status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + "status = " + status);

    }
}
