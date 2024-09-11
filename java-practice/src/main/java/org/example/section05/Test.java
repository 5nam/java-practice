package org.example.section05;

public class Test {
    public static void main(String[] args) {
        double rating = 7.1;

        // 최소값을 기준으로 결정되는 것이므로 9보다 작으면 어바웃타임 추천 가능
        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }

        // 최소값을 기준으로 결정되는 것이므로 8보다 작으면 토이스토리 추천 가능
        if (rating <= 8) {
            System.out.println("'토이스토리'를 추천합니다.");
        }

        // 최소값을 기준으로 결정되는 것이므로 7보다 작으면 고질라 추천 가능
        if (rating <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}
