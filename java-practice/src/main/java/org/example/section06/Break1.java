package org.example.section06;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) {
            sum += i;

            if (sum > 10) {
                break;
            }
            i++;
        }

        System.out.println(sum);
    }
}
