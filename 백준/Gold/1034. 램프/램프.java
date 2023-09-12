import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        int N = oh.nextInt(); // 행의 수
        int M = oh.nextInt(); // 열의 수
        oh.nextLine(); // 개행 문자 처리

        String[] lamps = new String[N];
        for (int i = 0; i < N; i++) {
            lamps[i] = oh.nextLine();
        }

        int K = oh.nextInt(); // 스위치를 누를 수 있는 최대 횟수

        int maxLamps = 0;
        for (int i = 0; i < N; i++) {
            int offCount = 0; // 꺼진 램프 개수

            // 현재 행에서 꺼진 램프 개수 세기
            for (int j = 0; j < M; j++) {
                if (lamps[i].charAt(j) == '0') {
                    offCount++;
                }
            }

            // 꺼진 램프 개수가 K보다 작거나 짝수인 경우
            if (offCount <= K && offCount % 2 == K % 2) {
                int sameRowLamps = 0;

                // 현재 행과 같은 패턴을 가진 다른 행 찾기
                for (int j = 0; j < N; j++) {
                    if (lamps[i].equals(lamps[j])) {
                        sameRowLamps++;
                    }
                }

                maxLamps = Math.max(maxLamps, sameRowLamps);
            }
        }

        System.out.println(maxLamps);
    }
}