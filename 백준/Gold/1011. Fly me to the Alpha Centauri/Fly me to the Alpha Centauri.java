import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        int T = oh.nextInt(); // 테스트 개수

        for (int t = 0; t < T; t++) {
            long X = oh.nextLong();
            long Y = oh.nextLong();
            long distance = Y - X; // 거리
            long answer = 0;
            long max = (long) Math.sqrt(distance);

            if (max * max == distance) {
                answer = 2 * max - 1;
            } else if (max * max < distance && distance <= max * max + max) {
                answer = 2 * max;
            } else {
                answer = 2 * max + 1;
            }

            System.out.println(answer);
        }
    }
}