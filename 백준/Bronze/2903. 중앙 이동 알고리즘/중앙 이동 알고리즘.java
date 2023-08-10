import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int N = oh.nextInt(); // N번째 사각형의 크기
        int points = 2; // 처음 사각형의 꼭짓점 개수

        for (int i = 0; i < N; i++) {
            points = points + points - 1; // 이전 사각형의 꼭짓점 개수에 2를 곱하고 1을 빼줌
        }

        int result = points * points; // 최종 꼭짓점 개수의 제곱
        System.out.println(result);
        oh.close();
    }
}