import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader oh = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(oh.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정수의 개수
        int M = Integer.parseInt(st.nextToken()); // 자리 숫자의 개수
        int[][] numGrid = new int[N][M];

        // 숫자 그리드 입력 받기
        for (int i = 0; i < N; i++) {
            String row = oh.readLine();
            for (int j = 0; j < M; j++) {
                numGrid[i][j] = row.charAt(j) - '0';
            }
        }

        int maxSquare = -1; // 가장 큰 제곱수

        // 모든 가능한 시작 위치에서 탐색
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // 4방향으로 이동하여 가능한 제곱수 찾기
                for (int dx = -N; dx <= N; dx++) {
                    for (int dy = -M; dy <= M; dy++) {
                        if (dx == 0 && dy == 0) {
                            continue;
                        }

                        int x = i;
                        int y = j;
                        int currentNum = 0;

                        while (isValid(x, y, N, M)) {
                            currentNum = currentNum * 10 + numGrid[x][y];
                            int squareRoot = (int) Math.sqrt(currentNum);
                            if (squareRoot * squareRoot == currentNum) {
                                maxSquare = Math.max(maxSquare, currentNum);
                            }

                            x += dx;
                            y += dy;
                        }
                    }
                }
            }
        }

        System.out.println(maxSquare);
    }

    // 좌표가 유효한지 확인하는 함수
    static boolean isValid(int x, int y, int N, int M) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }
}