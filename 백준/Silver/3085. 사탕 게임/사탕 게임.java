import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        int N = oh.nextInt();
        oh.nextLine();
        char[][] candies = new char[N][N];

        for (int i = 0; i < N; i++) {
            String line = oh.nextLine();
            for (int j = 0; j < N; j++) {
                candies[i][j] = line.charAt(j);
            }
        }
        oh.close();

        int maxCount = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                swap(candies, i, j, i, j + 1);
                maxCount = Math.max(maxCount, countMaxConsecutive(candies));
                swap(candies, i, j, i, j + 1);
            }
        }

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N - 1; i++) {
                swap(candies, i, j, i + 1, j);
                maxCount = Math.max(maxCount, countMaxConsecutive(candies));
                swap(candies, i, j, i + 1, j);
            }
        }

        System.out.println(maxCount);
    }

    public static void swap(char[][] candies, int i1, int j1, int i2, int j2) {
        char temp = candies[i1][j1];
        candies[i1][j1] = candies[i2][j2];
        candies[i2][j2] = temp;
    }

    public static int countMaxConsecutive(char[][] candies) {
        int N = candies.length;
        int maxCount = 1;

        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 1; j < N; j++) {
                if (candies[i][j] == candies[i][j - 1]) {
                    count++;
                } else {
                    count = 1;
                }
                maxCount = Math.max(maxCount, count);
            }
        }

        for (int j = 0; j < N; j++) {
            int count = 1;
            for (int i = 1; i < N; i++) {
                if (candies[i][j] == candies[i - 1][j]) {
                    count++;
                } else {
                    count = 1;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}