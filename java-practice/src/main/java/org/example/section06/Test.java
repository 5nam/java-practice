package org.example.section06;

public class Test {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
