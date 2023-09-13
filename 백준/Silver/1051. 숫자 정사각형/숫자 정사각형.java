import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        int N = oh.nextInt();
        int M = oh.nextInt();
        int[][] matrix = new int[N][M];

        for (int i = 0; i < N; i++) {
            String row = oh.next();
            for (int j = 0; j < M; j++) {
                matrix[i][j] = row.charAt(j) - '0';
            }
        }

        int maxSquareSize = 1;
        int minSize = Math.min(N, M);

        for (int size = 2; size <= minSize; size++) {
            for (int i = 0; i < N - size + 1; i++) {
                for (int j = 0; j < M - size + 1; j++) {
                    if (matrix[i][j] == matrix[i + size - 1][j] &&
                        matrix[i][j] == matrix[i][j + size - 1] &&
                        matrix[i][j] == matrix[i + size - 1][j + size - 1]) {
                        maxSquareSize = size;
                    }
                }
            }
        }

        int maxSquareArea = maxSquareSize * maxSquareSize;
        System.out.println(maxSquareArea);
    }
}