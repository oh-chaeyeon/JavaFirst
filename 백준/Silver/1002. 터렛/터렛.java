import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        int T = oh.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            int x1 = oh.nextInt();
            int y1 = oh.nextInt();
            int r1 = oh.nextInt();
            int x2 = oh.nextInt();
            int y2 = oh.nextInt();
            int r2 = oh.nextInt();

            int distanceSquared = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
            int sumOfRadiiSquared = (r1 + r2) * (r1 + r2);
            int differenceOfRadiiSquared = (r1 - r2) * (r1 - r2);

            // 두 원의 중심이 동일하고 반지름도 같으면 무한대
            if (x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println(-1);
            } else if (distanceSquared > sumOfRadiiSquared || distanceSquared < differenceOfRadiiSquared) {
                // 두 원이 겹치지 않을 때
                System.out.println(0);
            } else if (distanceSquared == sumOfRadiiSquared || distanceSquared == differenceOfRadiiSquared) {
                // 두 원이 외접 또는 내접할 때
                System.out.println(1);
            } else {
                // 두 원이 두 점에서 만날 때
                System.out.println(2);
            }
        }
    }
}