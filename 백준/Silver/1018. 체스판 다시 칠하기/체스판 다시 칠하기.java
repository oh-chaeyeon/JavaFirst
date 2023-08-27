import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] size = br.readLine().split(" ");
        int N = Integer.parseInt(size[0]);
        int M = Integer.parseInt(size[1]);

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int minCount = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int countW = 0;
                int countB = 0;

                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {
                        char currentColor = board[x][y];
                        if ((x + y) % 2 == 0) {
                            if (currentColor != 'W') {
                                countW++;
                            } else {
                                countB++;
                            }
                        } else {
                            if (currentColor != 'B') {
                                countW++;
                            } else {
                                countB++;
                            }
                        }
                    }
                }

                int minInCurrentCase = Math.min(countW, countB);
                minCount = Math.min(minCount, minInCurrentCase);
            }
        }

        System.out.println(minCount);
        br.close();
    }
}