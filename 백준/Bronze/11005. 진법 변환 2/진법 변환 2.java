import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int N = oh.nextInt(); // 10진수로 표현된 수
        int B = oh.nextInt(); // 목표 진법

        StringBuilder result = new StringBuilder();

        while (N > 0) {
            int remainder = N % B;
            if (remainder < 10) {
                result.insert(0, (char) ('0' + remainder));
            } else {
                result.insert(0, (char) ('A' + remainder - 10));
            }
            N /= B;
        }

        System.out.println(result);

        oh.close();
    }
}